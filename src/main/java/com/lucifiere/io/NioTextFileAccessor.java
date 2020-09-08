package com.lucifiere.io;

import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.log.StaticLog;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 基于NIO的简易文本工具
 *
 * @author created by XD.Wang
 * Date 2020/7/12.
 */
final public class NioTextFileAccessor {

    public static String loadFile(String pathStr) {
        try {
            Path path = Paths.get(pathStr);
            return String.join("\n", Files.readAllLines(path));
        } catch (IOException e) {
            StaticLog.error("外部文件加载失败！", e);
            throw ExceptionUtil.wrapRuntime(e);
        }
    }

    public static String loadEmbedFile(String fileName) {
        try {
            URL s = NioTextFileAccessor.class.getClassLoader()
                    .getResource(fileName.startsWith("/") ? fileName.substring(1) : fileName);
            assert s != null;
            Path path = Paths.get(s.getFile());
            return String.join("\n", Files.readAllLines(path));
        } catch (IOException e) {
            StaticLog.error("外部文件加载失败！", e);
            throw ExceptionUtil.wrapRuntime(e);
        }
    }

    public static void writeText(String text, String pathStr) {
        try {
            Path path = Paths.get(pathStr);
            Files.write(path, text.getBytes());
        } catch (IOException e) {
            StaticLog.error("写入外部文件失败！", e);
            throw ExceptionUtil.wrapRuntime(e);
        }
    }

    public static void createFile(String text, String pathStr, String fileName) {
        try {
            Path path = Paths.get(pathStr + "/" + fileName);
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            Files.write(path, text.getBytes());
        } catch (IOException e) {
            StaticLog.error("写入外部文件失败！", e);
            throw ExceptionUtil.wrapRuntime(e);
        }
    }

}
