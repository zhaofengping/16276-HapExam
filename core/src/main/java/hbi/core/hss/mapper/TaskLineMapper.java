package hbi.core.hss.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.hss.dto.TaskLine;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 谢子曦 on 2016/12/22
 */
@Repository("taskLineMapper")
public interface TaskLineMapper extends Mapper<TaskLine> {
    /**
     * 根据ITEM_HEADER_ID查找SEQ_NUM最大值+1
     */
    Long findMaxSeqNum(Long itemHeaderId);

    /**
     * 根据itemHeaderId删除数据
     */
    Integer deleteById(Long itemHeaderId);
}
