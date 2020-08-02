package com.lucifiere.exporter;

import com.lucifiere.render.View;

import java.util.List;

/**
 * 输出工具，输出结果到端
 *
 * @author created by XD.Wang
 * Date 2020/7/12.
 */
public interface Exporter {

    void export(List<View> views);

}
