package com.lucifiere.common;

import cn.hutool.core.util.ReflectUtil;
import com.lucifiere.exporter.Exporter;
import com.lucifiere.extract.Extractor;
import com.lucifiere.io.NioTextFileAccessor;
import com.lucifiere.io.TextFileAccessor;
import com.lucifiere.render.Render;
import com.lucifiere.resovler.Resolver;

import java.util.Optional;
import java.util.stream.Stream;

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
        Render render,
        Exporter exporter) {

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
        this.render = Optional.ofNullable(render).orElseThrow();
        this.exporter = Optional.ofNullable(exporter).orElseThrow();
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
        private TextFileAccessor textFileAccessor;
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

        public Creator setRender(Render render) {
            this.render = render;
            return this;
        }

        public Creator setExporter(Exporter exporter) {
            this.exporter = exporter;
            return this;
        }

        public GlobalContext init() {
            GlobalContext globalContext = new GlobalContext(workspacePath, inputPath, outputPath, ddlName, textFileAccessor, resolver, extractor, render, exporter);
            Stream.of(textFileAccessor, render, resolver, exporter, extractor).forEach(component -> {
                if (component instanceof GlobalContextAware globalContextAware) {
                    ReflectUtil.invoke(globalContextAware, "setGlobalContext", globalContext);
                }
            });
            return globalContext;
        }
    }

}


