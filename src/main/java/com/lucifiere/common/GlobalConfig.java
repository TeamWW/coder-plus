package com.lucifiere.common;

import com.lucifiere.exporter.Exporter;
import com.lucifiere.extract.Extractor;
import com.lucifiere.resovler.Resolver;

import java.util.Optional;

/**
 * 全局配置
 *
 * @author created by XD.Wang
 * Date 2020/7/12.
 */
public record GlobalConfig(
        String workspacePath,
        String outputDir,
        String ddlName,
        String templatesConfigScanPath,
        Class<? extends Resolver>resolver,
        Class<? extends Extractor>extractor,
        Class<? extends Exporter>exporter) {

    public GlobalConfig {
        // 可默认的配置
        this.outputDir = Optional.ofNullable(outputDir).orElse("output");
        this.ddlName = Optional.ofNullable(outputDir).orElse("ddl.sql");
        this.templatesConfigScanPath = Optional.ofNullable(templatesConfigScanPath).orElse(null);
        this.workspacePath = Optional.ofNullable(workspacePath).orElseThrow();
        // 可扩展的配置
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
        private String outputDir;
        private String ddlName;
        private String templatesPath;
        private Class<? extends Resolver> resolver;
        private Class<? extends Extractor> extractor;
        private Class<? extends Exporter> exporter;

        public void setWorkspacePath(String workspacePath) {
            this.workspacePath = workspacePath;
        }

        public void setOutputDir(String outputDir) {
            this.outputDir = outputDir;
        }

        public void setDdlName(String ddlName) {
            this.ddlName = ddlName;
        }

        public void setTemplatesPath(String templatesPath) {
            this.templatesPath = templatesPath;
        }

        public Creator setResolver(Class<? extends Resolver> resolver) {
            this.resolver = resolver;
            return this;
        }

        public Creator setExtractor(Class<? extends Extractor> extractor) {
            this.extractor = extractor;
            return this;
        }

        public Creator setExporter(Class<? extends Exporter> exporter) {
            this.exporter = exporter;
            return this;
        }

        public GlobalConfig init() {
            return new GlobalConfig(workspacePath, outputDir, ddlName, templatesPath, resolver, extractor, exporter);
        }
    }
}


