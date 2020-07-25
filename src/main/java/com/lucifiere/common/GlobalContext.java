package com.lucifiere.common;

import com.lucifiere.exporter.Exporter;
import com.lucifiere.extract.Extractor;
import com.lucifiere.io.NioTextLoader;
import com.lucifiere.io.TextLoader;
import com.lucifiere.render.Render;
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
        TextLoader textLoader,
        Resolver resolver,
        Extractor extractor,
        Render render,
        Exporter exporter) {

    public GlobalContext {
        // 自定义配置
        this.workspacePath = Optional.ofNullable(workspacePath).orElseThrow(() -> new RuntimeException("工作目录配置有误！"));
        // 可默认的配置
        this.inputPath = Optional.ofNullable(inputPath).orElse("input");
        this.outputPath = Optional.ofNullable(outputPath).orElse("output");
        this.ddlName = Optional.ofNullable(outputPath).orElse("ddl.sql");
        this.textLoader = Optional.ofNullable(textLoader).orElse(new NioTextLoader());
        // 可扩展的配置
        this.resolver = Optional.ofNullable(resolver).orElseThrow(() -> new RuntimeException("组件配置有误！！"));
        this.extractor = Optional.ofNullable(extractor).orElseThrow(() -> new RuntimeException("组件配置有误！！"));
        this.render = Optional.ofNullable(render).orElseThrow(() -> new RuntimeException("组件配置有误！！"));
        this.exporter = Optional.ofNullable(exporter).orElseThrow(() -> new RuntimeException("组件配置有误！！"));
    }

    /**
     * 按需构建全局配置
     *
     * @author created by XD.Wang
     * Date 2020/7/12.
     */
    class Creator {

        private String workspacePath;
        private String inputPath;
        private String outputPath;
        private String ddlName;
        private TextLoader textLoader;
        private Resolver resolver;
        private Extractor extractor;
        private Render render;
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

        public Creator setTextLoader(TextLoader textLoader) {
            this.textLoader = textLoader;
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

        public Creator setRender(Render render) {
            this.render = render;
            return this;
        }

        public Creator setExporter(Exporter exporter) {
            this.exporter = exporter;
            return this;
        }

        public GlobalContext create() {
            return new GlobalContext(workspacePath, inputPath, outputPath, ddlName, textLoader, resolver, extractor, render, exporter);
        }
    }

}


