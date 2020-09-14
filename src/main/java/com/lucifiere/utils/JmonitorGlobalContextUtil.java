package com.lucifiere.utils;


import cn.hutool.core.collection.CollectionUtil;
import com.google.common.collect.Lists;
import com.lucifiere.container.GlobalContext;
import com.lucifiere.container.GlobalContextAware;
import com.lucifiere.group.spec.GroupSpec;
import com.lucifiere.templates.spec.TemplateSpec;

import java.util.List;

/**
 * @author created by wuhuilin
 * Date 2020/9/14.
 */
public final class JmonitorGlobalContextUtil implements GlobalContextAware {
    private static GlobalContext globalContext;

    public static TemplateSpec getTemplate(String id) {
        if (null == globalContext) {
            return null;
        }
        TemplateSpec templateSpec = null;
        try {
            templateSpec = globalContext.getTemplateById(id);
        } catch (Exception e) {

        }
        return templateSpec;
    }

    public static GroupSpec getGroup(String id) {
        if (null == globalContext) {
            return null;
        }
        GroupSpec groupSpec = null;
        try {
            groupSpec = globalContext.getGroupById(id);
        } catch (Exception e) {

        }
        return groupSpec;
    }

    public static List<String> getTemplateIdsByGroupId(String groupId) {
        GroupSpec groupSpec = getGroup(groupId);
        if (null == groupSpec || CollectionUtil.isEmpty(groupSpec.getTemplateIds())) {
            return Lists.newArrayList();
        }
        return groupSpec.getTemplateIds();
    }

    @Override
    public void setGlobalContext(GlobalContext gc) {
        globalContext = gc;
    }
}
