package com.lucifiere.extract.table;

import com.lucifiere.container.ManagedBean;
import com.lucifiere.demo.Cons;
import com.lucifiere.model.Model;

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
