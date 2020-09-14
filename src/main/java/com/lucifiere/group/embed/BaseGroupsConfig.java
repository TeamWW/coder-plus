package com.lucifiere.group.embed;

import com.lucifiere.group.spec.Group;
import com.lucifiere.group.spec.GroupSpec;
import com.lucifiere.group.spec.Groups;

import static com.lucifiere.templates.embed.BaseTemplatesConfig.*;

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
