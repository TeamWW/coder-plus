package com.dlin.extract.table;

import com.dlin.container.ManagedBean;
import com.dlin.demo.Cons;
import com.dlin.model.Model;

/**
 * @author created by XD.Wang
 * Date 2020/9/14.
 */
@ManagedBean
public class CustomizedNamedExtractor extends TableExtractor {

    @Override
    public Model extract() {
        Model model = super.extract();
        model.setName(Cons.CUSTOMIZED_MODEL_NAME);
        return model;
    }

}
