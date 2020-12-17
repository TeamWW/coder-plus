package com.dlin.utils;

import cn.hutool.core.util.StrUtil;
import com.dlin.common.FiledType;

import java.util.Set;
import java.util.function.Function;

public class EnumUtils {

    /**
     * 根据外部值进行枚举查询
     *
     * @param val       外部值
     * @param extractor 枚举值提取器
     * @return 外部值对应的目标枚举
     */
    public static FiledType getFieldTypeByVal(String val, Function<FiledType, String> extractor, Set<FiledType> enums) {
        return enums.stream().filter(t -> StrUtil.equalsAnyIgnoreCase(val, extractor.apply(t))).findAny().orElse(null);
    }

}
