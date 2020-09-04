package com.lucifiere.model.loader;

import com.lucifiere.demo.Cons;
import com.lucifiere.model.Model;

/**
 * @author created by XD.Wang
 * Date 2020/9/4.
 */
public class UserAttrLoader implements ModelAttrLoader {

    public static final String USER_NAME = "user";

    @Override
    public void loadTo(Model model) {
        model.addBuiltInAttr(USER_NAME, Cons.AUTHOR);
    }

}
