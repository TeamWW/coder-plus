package com.dlin.model.loader;

import com.dlin.demo.Cons;
import com.dlin.model.Model;
import com.dlin.model.enums.BaseBuiltInAttr;

/**
 * @author created by XD.Wang
 * Date 2020/9/4.
 */
public class UserAttrLoader implements ModelAttrLoader {

    @Override
    public void loadTo(Model model) {
        model.addBuiltInAttr(BaseBuiltInAttr.BASE_AUTHOR.key(), Cons.AUTHOR);
    }

}
