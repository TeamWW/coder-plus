import java.util.Date;

/**
* POJO FOR ${_m_comment}
*
* Created By @author ${_au}
* Date ${.now}
*/
public class ${_m_cf} {

<#list _f as filed>
    /**
    * ${filed._f_comment}
    */
    private ${filed._f_jt} ${filed._f_c};

</#list>

<#list _f as filed>

    /**
    * 【${filed._f_comment}】访问器
    */
    public ${filed._f_jt} get${filed._f_cf}() {
        return ${filed._f_c};
    }

    /**
    * 【${filed._f_comment}】修改器
    */
    public void set${filed._f_cf}(${filed._f_jt} ${filed._f_c}) {
        this.${filed._f_c} = ${filed._f_c};
    }
</#list>

}
