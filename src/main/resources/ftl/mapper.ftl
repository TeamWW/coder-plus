import java.util.List;
import org.apache.ibatis.annotations.Param;
import ${_base_pk}.model.${_m_cf}${serviceInSuf}
import ${_base_pk}.model.${_m_cf}${serviceOutSuf}

/**
 * Mapper FOR ${_m_comment}
 *
 * Created By @author ${_au}
 * Date ${.now}
 * Generated by Coder-Plus
 */
public interface ${_m_cf}Mapper {

    /**
     * 根据DO参数查询符合条件的结果列表
     *
     * @param ${_m} 查询条件
     * @return 结果列表
     */
    List<${_m_cf}${serviceOutSuf}> select${_m_cf}ListByParam(${_m_cf}${serviceInSuf} ${_m});

    /**
     * 根据ID查询符合条件的结果
     *
     * @param id 查询条件
     * @return 结果
     */
    ${_m_cf}${serviceOutSuf} select${_m_cf}ById(${_pk._f_jt} id);

    /**
     * 单条数据新增
     *
     * @param ${_m} 待入库数据
     * @return 影响行数
     */
    Long insert${_m_cf}(${_m_cf}${serviceInSuf} ${_m});

    /**
     * 批量数据新增
     *
     * @param ${_m} 待入库数据
     * @return 影响行数
     */
    Long batchInsert${_m_cf}(${_m_cf}${serviceInSuf} ${_m});

    /**
     * 根据ID对单条数据更新
     *
     * @param ${_m} 待入库数据
     * @return 影响行数
     */
    Long update${_m_cf}ById(${_m_cf}${serviceInSuf} ${_m});

    /**
     * 根据主键删除
     *
     * @param id 主键
     */
    void delete${_m_cf}ById(${_pk._f_jt} id);

}