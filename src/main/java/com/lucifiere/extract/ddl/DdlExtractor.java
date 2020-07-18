package com.lucifiere.extract.ddl;

import com.google.common.base.Joiner;
import com.lucifiere.common.GlobalContext;
import com.lucifiere.extract.AbstractExtractor;
import com.lucifiere.extract.Model;
import com.lucifiere.io.NioTextLoader;
import com.lucifiere.io.TextLoader;

/**
 * @author created by XD.Wang
 * Date 2020/7/12.
 */
public class DdlExtractor extends AbstractExtractor {

    private TextLoader textLoader;

    public DdlExtractor(GlobalContext globalContext) {
        super(globalContext);
        this.textLoader = new NioTextLoader();
    }

    public Model extract() {
        var ddlPath = Joiner.on("/").join(context.workspacePath(), context.inputPath(), context.ddlName());
        textLoader.loadText(ddlPath);
        return null;
    }

}
