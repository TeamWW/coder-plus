package com.lucifiere.common;

import com.lucifiere.exporter.Exporter;
import com.lucifiere.extract.Extractor;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.io.TextFileAccessor;
import com.lucifiere.resovler.Resolver;
import com.lucifiere.templates.TemplateContainer;

import java.util.Optional;

/**
 * 全局配置
 *
 * @author created by XD.Wang
 * Date 2020/7/12.
 */
public record GlobalContext(
        String workspacePath,
        String inputPath,
        String outputPath,
        String ddlName,
        TextFileAccessor textFileAccessor,
        Resolver resolver,
        Extractor extractor,
        Exporter exporter,
        TemplateContainer templateContainer) {

    public GlobalContext {
        // 自定义配置
        this.workspacePath = Optional.ofNullable(workspacePath).orElseThrow();
        // 可默认的配置
        this.inputPath = Optional.ofNullable(inputPath).orElse("input");
        this.outputPath = Optional.ofNullable(outputPath).orElse("output");
        this.ddlName = Optional.ofNullable(outputPath).orElse("ddl.sql");
        this.textFileAccessor = Optional.ofNullable(textFileAccessor).orElse(new NioTextFileAccessor());
        // 可扩展的配置
        this.resolver = Optional.ofNullable(resolver).orElseThrow();
        this.extractor = Optional.ofNullable(extractor).orElseThrow();
        this.exporter = Optional.ofNullable(exporter).orElseThrow();
        this.templateContainer = Optional.ofNullable(templateContainer).orElseThrow();
    }

    /**
     * 按需构建全局配置
     *
     * @author created by XD.Wang
     * Date 2020/7/12.
     */
    public static class Creator {

        private String workspacePath;
        private String inputPath;
        private String outputPath;
        private String ddlName;
        private TextFileAccessor textFileAccessor;
        private Resolver resolver;
        private Extractor extractor;
        private Exporter exporter;
        private TemplateContainer templateContainer;

        public Creator setWorkspacePath(String workspacePath) {
            this.workspacePath = workspacePath;
            return this;
        }

        public Creator setInputPath(String inputPath) {
            this.inputPath = inputPath;
            return this;
        }

        public Creator setOutputPath(String outputPath) {
            this.outputPath = outputPath;
            return this;
        }

        public Creator setDdlName(String ddlName) {
            this.ddlName = ddlName;
            return this;
        }

        public Creator setTextFileAccessor(TextFileAccessor textFileAccessor) {
            this.textFileAccessor = textFileAccessor;
            return this;
        }

        public Creator setResolver(Resolver resolver) {
            this.resolver = resolver;
            return this;
        }

        public Creator setExtractor(Extractor extractor) {
            this.extractor = extractor;
            return this;
        }

        public Creator setExporter(Exporter exporter) {
            this.exporter = exporter;
            return this;
        }

        public Creator setTemplateContainer(TemplateContainer templateContainer) {
            this.templateContainer = templateContainer;
            return this;
        }

        public GlobalContext init() {
            return new GlobalContext(workspacePath, inputPath, outputPath, ddlName, textFileAccessor, resolver, extractor, exporter, templateContainer);
        }

    }

}


