package com.lucifiere.templates;

import cn.hutool.core.annotation.AnnotationUtil;
import cn.hutool.core.util.ReflectUtil;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.lucifiere.templates.spec.Template;
import com.lucifiere.templates.spec.TemplateSpec;
import com.lucifiere.templates.spec.Templates;

import java.util.*;

/**
 * 模板容器
 *
 * @author wuhuilin
 * Date 2020-8-23.
 */
public class TemplateContainer {

    private static volatile TemplateContainer container;

    private final Map<String, TemplateSpec> specMap = Maps.newConcurrentMap();

    public Map<String, TemplateSpec> getSpecMap() {
        return specMap;
    }

    public TemplateSpec getTemplateById(String id) {
        return specMap.get(id);
    }

    public Set<TemplateSpec> getAllTemplates() {
        return Sets.newHashSet(specMap.values());
    }

    public void registerTemplates(List<TemplateSpec> templates) {
        Optional.ofNullable(templates).ifPresent(templateSpecs -> templateSpecs.forEach(this::registerTemplate));
    }

    public void registerTemplate(TemplateSpec template) {
        if (null != specMap.get(template.getId())) {
            return;
        }
        specMap.put(template.getId(), template);
    }

    public static TemplateContainer init(Set<Class<?>> classes) {
        if (container == null) {
            container = new TemplateContainer();
            register(classes, container.getSpecMap());
        }
        return container;
    }

    public static void register(Set<Class<?>> classes, Map<String, TemplateSpec> map) {
        classes.parallelStream().forEach(clazz -> {
            Templates ts = AnnotationUtil.getAnnotation(clazz, Templates.class);
            if (ts != null && !ts.skip()) {
                Object ins = ReflectUtil.newInstance(clazz);
                Arrays.stream(clazz.getDeclaredMethods()).forEach(method -> {
                    Template define = AnnotationUtil.getAnnotation(method, Template.class);
                    if (define != null) {
                        Object obj = ReflectUtil.invoke(ins, method);
                        if (obj instanceof TemplateSpec spec) {
                            map.put(spec.getId(), spec);
                        }
                    }
                });
            }
        });
    }

}
