package com.dlin.resovler.antlr;

import com.dlin.antlr.thrift.ThriftBaseListener;
import com.dlin.antlr.thrift.ThriftLexer;
import com.dlin.antlr.thrift.ThriftParser;
import com.dlin.common.FiledType;
import com.dlin.container.ManagedBean;
import com.dlin.model.Model;
import com.dlin.model.ThriftModel;
import com.dlin.model.ThriftStructModel;
import com.dlin.model.meta.Field;
import com.dlin.resovler.Resolver;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Optional;

/**
 * @author created by XD.Wang
 * Date 2020/12/16.
 */
@ManagedBean
public class AntlrThriftResolver extends ThriftBaseListener implements Resolver {

    private ThriftModel thriftModel;

    private Field fieldCursor;

    private ThriftStructModel structCursor;

    private Field getFieldCursor() {
        fieldCursor = Optional.ofNullable(fieldCursor).orElse(new Field());
        return fieldCursor;
    }

    private ThriftStructModel getStructCursor() {
        structCursor = Optional.ofNullable(structCursor).orElse(new ThriftStructModel());
        return structCursor;
    }

    private void resetFieldCursor() {
        fieldCursor = null;
    }

    private void resetStructCursor() {
        structCursor = null;
    }

    public void setThriftModel(ThriftModel thriftModel) {
        this.thriftModel = thriftModel;
    }

    @Override
    public void enterNamespace(ThriftParser.NamespaceContext ctx) {
        TerminalNode nameSpace = ctx.getChild(TerminalNode.class, 2);
        thriftModel.setNameSpace(AntlrUtils.extractContent(nameSpace));
    }

    @Override
    public void enterStruct(ThriftParser.StructContext ctx) {
        TerminalNode name = ctx.getChild(TerminalNode.class, 1);
        getStructCursor().setKeyword(AntlrUtils.extractContent(name));
    }

    @Override
    public void exitStruct(ThriftParser.StructContext ctx) {
        ThriftStructModel m = getStructCursor();
        m.setNameSpace(thriftModel.getNameSpace());
        thriftModel.addThriftStructModel(m);
        resetStructCursor();
    }

    @Override
    public void enterField(ThriftParser.FieldContext ctx) {
        ThriftParser.Field_typeContext typeNode = ctx.getChild(ThriftParser.Field_typeContext.class, 0);
        TerminalNode id = ctx.getChild(TerminalNode.class, 0);
        String type = AntlrUtils.extractContent(typeNode);
        FiledType filedType = FiledType.getByThriftType(type);
        getFieldCursor().setType(Optional.ofNullable(filedType).orElse(new FiledType(type, null, null, type)));
        getFieldCursor().setName(AntlrUtils.extractContent(id));
    }

    @Override
    public void exitField(ThriftParser.FieldContext ctx) {
        getStructCursor().addTableFiled(getFieldCursor());
        resetFieldCursor();
    }

    @Override
    public Model resolve(String text) {
        CodePointCharStream input = CharStreams.fromString(text);
        ThriftLexer lexer = new ThriftLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ThriftParser parser = new ThriftParser(tokens);
        ThriftParser.DocumentContext ctDdlTree = parser.document();
        ParseTreeWalker walker = new ParseTreeWalker();
        ThriftModel model = new ThriftModel();
        this.setThriftModel(model);
        walker.walk(this, ctDdlTree);
        return model;
    }

}
