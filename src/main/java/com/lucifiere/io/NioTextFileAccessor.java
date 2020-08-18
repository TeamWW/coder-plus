package com.lucifiere.io;

import cn.hutool.core.exceptions.ExceptionUtil;
import cn.hutool.log.StaticLog;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 基于NIO的简易文本工具
 *
 * @author created by XD.Wang
 * Date 2020/7/12.
 */
public class NioTextFileAccessor implements TextFileAccessor {

    @Override
    public String loadText(String pathStr) {
        try {
            var path = Paths.get(pathStr);
            return Files.readString(path);
        } catch (IOException e) {
            StaticLog.error("外部文件加载失败！", e);
            throw ExceptionUtil.wrapRuntime(e);
        }
    }

    public void writeText(String text, String pathStr) {
        try {
            var path = Paths.get(pathStr);
            Files.write(path, text.getBytes());
        } catch (IOException e) {
            StaticLog.error("写入外部文件失败！", e);
            throw ExceptionUtil.wrapRuntime(e);
        }
    }

    public void createFile(String text, String pathStr, String fileName) {
        try {
            var path = Paths.get(pathStr + "/" + fileName);
            Files.write(path, text.getBytes());
        } catch (IOException e) {
            StaticLog.error("写入外部文件失败！", e);
            throw ExceptionUtil.wrapRuntime(e);
        }
    }

}
