package com.lucifiere.extract.table;

import com.google.common.base.Joiner;
import com.lucifiere.common.GlobalContext;
import com.lucifiere.extract.AbstractExtractor;
import com.lucifiere.extract.Model;
import com.lucifiere.resovler.Resolver;
import com.lucifiere.io.NioTextLoader;
import com.lucifiere.io.TextLoader;

/**
 * 表数据提取器
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class TableExtractor extends AbstractExtractor {

    private TextLoader textLoader;

    private Resolver resolver;

    public TableExtractor(GlobalContext globalContext) {
        super(globalContext);
        this.textLoader = new NioTextLoader();
    }

    public Model extract() {
        var ddlPath = Joiner.on("/").join(context.workspacePath(), context.inputPath(), context.ddlName());
        String ddlStr = textLoader.loadText(ddlPath);
        return null;
    }

    private void extractTableModel(){

    }

}
