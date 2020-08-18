package com.lucifiere.templates;

/**
 * 定义模板
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public interface Template {

    /**
     * 模板生成文件前缀
     *
     * @return 前缀信息
     */
    String fileSuffix();

    /**
     * 模板生成文件后缀
     *
     * @return 后缀新
     */
    String filePrefix();

}