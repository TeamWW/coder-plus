import java.util.Date;

/**
* POJO FOR ${biz-desc}
*
* Created By @author ${user}
* Date ${.now}
*/
public class ${cf-biz} {

<#list fs as it>
    /**
    * ${it.comment}
    */
    private ${it.fieldType.javaType} ${it.name};
</#list>

<#list fs as it>
    /**
    * 【${it.comment}】访问器
    */
    public ${it.fieldType.javaType} get${it.cfName}() {
    return ${it.name};
    }

    /**
    * 【${it.comment}】修改器
    */
    public void set${it.cfName}(${it.fieldType.javaType} ${it.name}) {
    this.${it.name} = ${it.name};
    }
</#list>

}
