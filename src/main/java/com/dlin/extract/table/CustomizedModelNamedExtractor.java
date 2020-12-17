package com.dlin.extract.table;

import com.dlin.container.ManagedBean;
import com.dlin.model.Model;
import com.dlin.model.loader.PropertiesAttrLoader;

import java.util.Optional;

/**
 * 支持自定义model name
 *
 * @author created by XD.Wang
 * Date 2020/9/14.
 */
@ManagedBean
public class CustomizedModelNamedExtractor extends SourceCodeExtractor {

    @Override
    public Model extract() {
        Model model = super.extract();
        Optional.ofNullable(PropertiesAttrLoader.getLoader().getCustomizedModelSetting()).ifPresent(model::setKeyword);
        return model;
    }

}
