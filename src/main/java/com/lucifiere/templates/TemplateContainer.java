package com.lucifiere.templates;

import com.google.common.collect.Maps;
import com.lucifiere.templates.spec.TemplateRegister;
import com.lucifiere.templates.spec.TemplateSpec;
import com.lucifiere.utils.MyMapUtils;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * @author created by XD.Wang
 * Date 2020/8/18.
 */
public class TemplateContainer {

    private static volatile TemplateContainer CONTAINER;

    private static final Map<String, TemplateSpec> SPEC_MAP = Maps.newHashMap();

    public TemplateSpec getTemplateById(String id) {
        return null;
    }

    public TemplateSpec getAllTemplates() {
        return null;
    }

    public void registerTemplates(List<TemplateSpec> templates) {

    }

    public void registerTemplate(List<TemplateSpec> templates) {

    }

    public static TemplateContainer init(Set<Class<?>> classes) {
        List<TemplateSpec> specs = TemplateRegister.scan(classes);
        Optional.ofNullable(specs).ifPresent(s -> SPEC_MAP.putAll(MyMapUtils.singleGroupBy(s, TemplateSpec::getId)));
        return null;
    }

}
