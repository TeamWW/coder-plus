package com.lucifiere.templates;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.lucifiere.templates.spec.TemplateRegister;
import com.lucifiere.templates.spec.TemplateSpec;
import com.lucifiere.utils.MyMapUtils;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * 模板容器
 *
 * @author wuhuilin
 * Date 2020-8-23.
 */
public class TemplateContainer {

    private static volatile TemplateContainer CONTAINER;

    private static final Map<String, TemplateSpec> SPEC_MAP = Maps.newHashMap();

    public TemplateSpec getTemplateById(String id) {
        return SPEC_MAP.get(id);
    }

    public Set<TemplateSpec> getAllTemplates() {
        return Sets.newHashSet(SPEC_MAP.values());
    }

    public void registerTemplates(List<TemplateSpec> templates) {
        Optional.ofNullable(templates).ifPresent(templateSpecs -> templateSpecs.forEach(this::registerTemplate));
    }

    public void registerTemplate(TemplateSpec template) {
        if (null != SPEC_MAP.get(template.getId())) {
            return;
        }
        SPEC_MAP.put(template.getId(), template);
    }

    public static TemplateContainer init(Set<Class<?>> classes) {
        var specs = TemplateRegister.scan(classes);
        Optional.ofNullable(specs).ifPresent(s -> SPEC_MAP.putAll(MyMapUtils.singleGroupBy(s, TemplateSpec::getId)));
        // todo register template to container
        return CONTAINER;
    }

}
