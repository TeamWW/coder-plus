package com.lucifiere.utils;

import com.google.common.base.Preconditions;

import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public class EnumUtils {

    /**
     * 根据外部值进行枚举查询
     *
     * @param val       外部值
     * @param extractor 枚举值提取器
     * @param <T>       外部值类型
     * @return 外部值对应的目标枚举
     */
    public static <T, E extends Enum<?>> E getByValOrThrow(T val, Function<E, T> extractor, E... enums) {
        Preconditions.checkNotNull(val, "查询值不能为空！");
        return Stream.of(enums).filter(t -> Objects.equals(val, extractor.apply(t))).findAny().orElseThrow(() -> new IllegalArgumentException("不支持的类型！"));
    }

}
