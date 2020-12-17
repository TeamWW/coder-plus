package com.dlin.extract;

import com.dlin.model.Model;
import com.dlin.model.loader.ModelAttrLoader;
import com.dlin.model.loader.PropertiesAttrLoader;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * 自定义数据提取器
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public class CustomizedAttrExtractor extends AbstractExtractor {

    private final List<ModelAttrLoader> modelAttrLoaderList = Lists.newArrayList(
            PropertiesAttrLoader.getLoader()
    );

    @Override
    public Model extract() {
        Model m = new Model();
        modelAttrLoaderList.forEach(loader -> {
            loader.loadTo(m);
        });
        return m;
    }

}
