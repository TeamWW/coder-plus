import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ${serviceType}实现 FOR ${_m_comment}
 *
 * Created By @author ${_au}
 * Date ${.now}
 * Generated by Coder-Plus
 */
@Service
public class ${_m_cf}${serviceType}Impl implements ${_m_cf}${serviceType} {

    @Autowired
    private ${_m_cf}${subServiceType} ${_m}${subServiceType};

    /**
     * 根据DO参数查询符合条件的结果列表
     *
     * @param ${_m} 查询条件
     * @return 结果列表
     */
    @Override
    public List<${_m_cf}> select${_m_cf}ListByParam(${_m_cf} ${_m}) {
        return ${_m}${subServiceType}.select${_m_cf}ListByParam(${_m});
    }

    /**
     * 根据ID查询符合条件的结果
     *
     * @param id 主键
     * @return 结果
     */
    @Override
    public ${_m_cf} select${_m_cf}ById(Long id) {
        return ${_m}${subServiceType}.select${_m_cf}ById(id);
    }

    /**
     * 单条数据新增
     *
     * @param ${_m} 待入库数据
     * @return 影响行数
     */
    @Override
    public Long insert${_m_cf}(${_m_cf} ${_m}) {
        return ${_m}${subServiceType}.insert${_m_cf}(${_m});
    }

    /**
     * 根据ID对单条数据更新
     *
     * @param ${_m} 待入库数据
     * @return 影响行数
     */
    @Override
    public Long update${_m_cf}ById(${_m_cf} ${_m}) {
        return ${_m}${subServiceType}.update${_m_cf}ById(${_m});
    }

    /**
     * 根据主键删除
     *
     * @param id 主键
     */
    @Override
    public void delete${_m_cf}ById(Long id) {
        ${_m}${subServiceType}.delete${_m_cf}ById(id);
    }

}