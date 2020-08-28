package com.lucifiere.bootstrap;

import com.lucifiere.common.GlobalContext;
import com.lucifiere.exporter.CodeExporter;
import com.lucifiere.extract.table.TableExtractor;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.resovler.antlr.AntlrResolver;

public class DefaultBootstrap extends Bootstrap {

    @Override
    protected GlobalContext acquireContext() {
        return new GlobalContext.Creator()
                .setExporter(new CodeExporter())
                .setExtractor(new TableExtractor())
                .setTextFileAccessor(new NioTextFileAccessor())
                .setResolver(new AntlrResolver())
                .init();
    }

}
