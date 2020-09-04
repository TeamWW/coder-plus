package com.lucifiere.common;

import com.lucifiere.templates.TemplateSpecContainer;

/**
 * 为组件提供全局配置
 *
 * @author created by XD.Wang
 * Date 2020/7/12.
 */
public interface TemplateContainerAware {

    void setTemplateSpecContainer(TemplateSpecContainer templateSpecContainer);

}
