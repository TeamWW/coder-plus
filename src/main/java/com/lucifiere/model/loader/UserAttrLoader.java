package com.lucifiere.model.loader;

import com.lucifiere.demo.Cons;
import com.lucifiere.model.Model;
import com.lucifiere.model.enums.BaseBuiltInAttr;

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
