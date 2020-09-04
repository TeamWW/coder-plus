package com.lucifiere.common;

import com.lucifiere.exporter.Exporter;
import com.lucifiere.extract.Extractor;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.resovler.Resolver;

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
        String templatesPath,
        Resolver resolver,
        Extractor extractor,
        Exporter exporter) {

    public GlobalContext {
        // 可默认的配置
        this.inputPath = Optional.ofNullable(inputPath).orElse("input");
        this.outputPath = Optional.ofNullable(outputPath).orElse("output");
        this.ddlName = Optional.ofNullable(outputPath).orElse("ddl.sql");
        // 可扩展的配置
        this.workspacePath = Optional.ofNullable(workspacePath).orElseThrow();
        this.templatesPath = Optional.ofNullable(templatesPath).orElseThrow();
        this.resolver = Optional.ofNullable(resolver).orElseThrow();
        this.extractor = Optional.ofNullable(extractor).orElseThrow();
        this.exporter = Optional.ofNullable(exporter).orElseThrow();
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
        private String templatesPath;
        private Resolver resolver;
        private Extractor extractor;
        private Exporter exporter;

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

        public Creator setTemplatesPath(String templatesPath) {
            this.templatesPath = templatesPath;
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

        public GlobalContext init() {
            return new GlobalContext(workspacePath, inputPath, outputPath, ddlName, templatesPath, resolver, extractor, exporter);
        }

    }

}


