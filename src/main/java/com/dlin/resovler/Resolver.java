package com.dlin.resovler;

import com.dlin.model.Model;

/**
 * 文本解析工具解析工具
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public interface Resolver {

    /**
     * 将外部文本解析成模型数据
     *
     * @param text 外部文本
     * @return 模型
     */
    Model resolve(String text);

}
