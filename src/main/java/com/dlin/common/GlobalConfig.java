package com.dlin.common;

import com.dlin.exporter.Exporter;
import com.dlin.extract.Extractor;
import com.dlin.resovler.Resolver;

import java.util.Optional;

/**
 * 全局配置
 *
 * @author created by XD.Wang
 * Date 2020/7/12.
 */
public class GlobalConfig {

    private final String workspacePath;
    private final String outputDir;
    private final String ddlName;
    private final String templatesConfigScanPath;
    private final String groupsConfigScanPath;
    private final Class<? extends Resolver> resolver;
    private final Class<? extends Extractor> extractor;
    private final Class<? extends Exporter> exporter;

    public GlobalConfig(String workspacePath, String outputDir, String ddlName, String templatesConfigScanPath, Class<? extends Resolver> resolver, Class<? extends Extractor> extractor, Class<? extends Exporter> exporter, String groupsConfigScanPath) {
        // 可默认的配置
        this.outputDir = Optional.ofNullable(outputDir).orElse("output");
        this.ddlName = Optional.ofNullable(outputDir).orElse("ddl.sql");
        this.templatesConfigScanPath = Optional.ofNullable(templatesConfigScanPath).orElse(null);
        this.groupsConfigScanPath = Optional.ofNullable(groupsConfigScanPath).orElse(null);
        this.workspacePath = Optional.ofNullable(workspacePath).orElseThrow(() -> new RuntimeException("work space required！"));
        // 可扩展的配置
        this.resolver = Optional.ofNullable(resolver).orElseThrow(() -> new RuntimeException("resolver required！！"));
        this.extractor = Optional.ofNullable(extractor).orElseThrow(() -> new RuntimeException("extractor required！！"));
        this.exporter = Optional.ofNullable(exporter).orElseThrow(() -> new RuntimeException("exporter required！！"));
    }

    public String getWorkspacePath() {
        return workspacePath;
    }

    public String getOutputDir() {
        return outputDir;
    }

    public String getDdlName() {
        return ddlName;
    }

    public String getTemplatesConfigScanPath() {
        return templatesConfigScanPath;
    }

    public String getGroupsConfigScanPath() {
        return groupsConfigScanPath;
    }

    public Class<? extends Resolver> getResolver() {
        return resolver;
    }

    public Class<? extends Extractor> getExtractor() {
        return extractor;
    }

    public Class<? extends Exporter> getExporter() {
        return exporter;
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
        private String groupsConfigScanPath;
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

        public void setGroupsConfigScanPath(String groupsConfigScanPath) {
            this.groupsConfigScanPath = groupsConfigScanPath;
        }

        public GlobalConfig init() {
            return new GlobalConfig(workspacePath, outputDir, ddlName, templatesPath, resolver, extractor, exporter, groupsConfigScanPath);
        }
    }
}


