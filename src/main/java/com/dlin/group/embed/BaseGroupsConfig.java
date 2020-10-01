package com.dlin.group.embed;

import com.dlin.group.spec.Group;
import com.dlin.group.spec.GroupSpec;
import com.dlin.group.spec.Groups;

import static com.dlin.templates.embed.BaseTemplatesConfig.*;

/**
 * @author created by wuhuilin
 * Date 2020/9/14.
 */
@Groups
public class BaseGroupsConfig {

    public static final String STANDARD_GROUP = "standard";

    @Group("standard")
    public GroupSpec standardGroup() {
        GroupSpec g = new GroupSpec();
        g.addTemplate(EXAMPLE);
        g.addTemplate(POJO);
        return g;
    }
}
