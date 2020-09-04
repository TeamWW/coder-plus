package com.lucifiere.resovler;

import com.lucifiere.model.Model;

/**
 * 属性值解析工具
 *
 * @author XD.Wang
 * Date 2020-7-25.
 */
public interface Resolver {

    Model resolve(ResolverReq req);

}
