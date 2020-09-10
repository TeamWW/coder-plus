import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
* Mapper FOR ${_m_comment}
*
* Created By @author ${_au}
* Date ${.now}
*/
public interface ${_m_cf}Mapper {

    /**
    * 根据Example查询符合条件的结果列表
    *
    * @param ${entityName}Example 查询条件
    * @return 结果列表
    */
List<${capitalFirstEntityName}> select${capitalFirstEntityName}ListByExample(${capitalFirstEntityName} ${entityName}Example);

/**
* 根据DO参数查询符合条件的结果列表(分页)
*
* @param ${entityName} 查询条件
* @param pageInfo     分页
* @return 结果列表
*/
List<${capitalFirstEntityName}> select${capitalFirstEntityName}ByParamAndPage(@Param("param") ${capitalFirstEntityName} ${entityName}, @Param("pageInfo") PageInfo pageInfo);

/**
* 根据DO参数查询符合条件的结果列表(分页)
*
* @param ${entityName} 查询条件
* @param pageInfo     分页
* @return 结果列表
*/
Long select${capitalFirstEntityName}ListPageCount(@Param("param") ${capitalFirstEntityName} ${entityName}, @Param("pageInfo") PageInfo pageInfo);

/**
* 根据DO参数查询符合条件的结果列表
*
* @param ${entityName} 查询条件
* @return 结果列表
*/
List<${capitalFirstEntityName}> select${capitalFirstEntityName}ListByParam(${capitalFirstEntityName} ${entityName});

/**
* 根据ID查询符合条件的结果
*
* @param id 查询条件
* @return 结果
*/
${capitalFirstEntityName} select${capitalFirstEntityName}ById(Long id);

/**
* 单条数据新增
*
* @param ${entityName} 待入库数据
* @return 影响行数
*/
Long insert${capitalFirstEntityName}(${capitalFirstEntityName} ${entityName});

/**
* 根据ID对单条数据更新
*
* @param ${entityName} 待入库数据
* @return 影响行数
*/
Long update${capitalFirstEntityName}ById(${capitalFirstEntityName} ${entityName});

/**
* 根据主键删除
*
* @param id 主键
*/
void delete${capitalFirstEntityName}ById(Long id);
"""
}

@Override
protected String tailCode() {
"""
}
"""
}