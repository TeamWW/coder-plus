package com.lucifiere.common;

import com.lucifiere.templates.TemplateContainer;

/**
 * 为组件提供全局配置
 *
 * @author created by XD.Wang
 * Date 2020/7/12.
 */
public interface TemplateContainerAware {

    void setTemplateContainer(TemplateContainer templateContainer);

}
