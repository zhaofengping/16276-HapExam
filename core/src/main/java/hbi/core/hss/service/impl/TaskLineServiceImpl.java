package hbi.core.hss.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.hss.dto.TaskLine;
import hbi.core.hss.mapper.TaskLineMapper;
import hbi.core.hss.service.ITaskLineService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * TaskLineService实现类
 * Created by 谢子曦 on 2016/12/22
 */
@Service
@Transactional
public class TaskLineServiceImpl extends BaseServiceImpl<TaskLine> implements ITaskLineService {
    @Resource
    private TaskLineMapper taskLineMapper;

    /**
     * 根据ITEM_HEADER_ID查找SEQ_NUM最大值+1
     */
    @Override
    public Long findMaxSeqNum(Long itemHeaderId) {
        Long seqNum = null;
        seqNum = taskLineMapper.findMaxSeqNum(itemHeaderId);
        if(seqNum==null){
            return Long.parseLong("1");
        }else {
            return seqNum;
        }
    }

    /**
     * 根据itemHeaderId删除数据
     */
    @Override
    public Integer deleteById(Long itemHeaderId) {
        return taskLineMapper.deleteById(itemHeaderId);
    }

}
