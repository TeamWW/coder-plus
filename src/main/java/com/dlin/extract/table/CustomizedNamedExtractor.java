package com.dlin.extract.table;

import com.dlin.container.ManagedBean;
import com.dlin.model.Model;
import com.dlin.model.loader.PropertiesAttrLoader;

import java.util.Optional;

/**
 * @author created by XD.Wang
 * Date 2020/9/14.
 */
@ManagedBean
public class CustomizedNamedExtractor extends TableExtractor {

    @Override
    public Model extract() {
        Model model = super.extract();
        Optional.ofNullable(PropertiesAttrLoader.getLoader().getCustomizedModelSetting()).ifPresent(model::setName);
        return model;
    }

}
