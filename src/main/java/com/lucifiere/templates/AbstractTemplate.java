package com.lucifiere.templates;

import cn.hutool.core.util.StrUtil;
import org.apache.commons.lang3.tuple.Pair;

/**
 * @author created by XD.Wang
 * Date 2020/8/7.
 */
public abstract class AbstractTemplate implements Template {

    protected final Pair<String, String> prefixAndSuffix;

    public AbstractTemplate() {
        this.prefixAndSuffix = Pair.of(StrUtil.EMPTY, StrUtil.EMPTY);
    }

    public AbstractTemplate(Pair<String, String> prefixAndSuffix) {
        this.prefixAndSuffix = prefixAndSuffix;
    }

    @Override
    public String fileSuffix() {
        return prefixAndSuffix.getRight();
    }

    @Override
    public String filePrefix() {
        return prefixAndSuffix.getLeft();
    }

}
