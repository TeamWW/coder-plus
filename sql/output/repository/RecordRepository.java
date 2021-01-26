import java.util.List;
import com.sankuai.meituan.waimai.service.decoration.model.RecordQuery
import com.sankuai.meituan.waimai.service.decoration.model.RecordDO

/**
 * Repository FOR 物料迁移表
 *
 * Created By @author XD.Wang
 * Date 2020-10-27 16:55:18
 * Generated by Coder-Plus
 */
public interface RecordRepository {

    /**
     * 根据DO参数查询符合条件的结果列表
     *
     * @param record 查询条件
     * @return 结果列表
     */
    List<RecordDO> selectRecordListByParam(RecordQuery record);

    /**
     * 根据ID查询符合条件的结果
     *
     * @param id 主键
     * @return 结果
     */
    RecordDO selectRecordById(Long id);

    /**
     * 单条数据新增
     *
     * @param record 待入库数据
     * @return 影响行数
     */
    Long insertRecord(RecordQuery record);

    /**
     * 根据ID对单条数据更新
     *
     * @param record 待入库数据
     * @return 影响行数
     */
    Long updateRecordById(RecordQuery record);
    
    /**
     * 根据主键删除
     *
     * @param id 主键
     */
    void deleteRecordById(Long id);

}