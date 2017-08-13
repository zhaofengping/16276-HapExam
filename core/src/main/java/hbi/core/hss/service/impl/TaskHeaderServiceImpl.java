package hbi.core.hss.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.hss.dto.TaskHeader;
import hbi.core.hss.mapper.TaskHeaderMapper;
import hbi.core.hss.mapper.TaskLineMapper;
import hbi.core.hss.service.ITaskHeaderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 谢子曦 on 2016/12/20
 */
@Service
@Transactional
public class TaskHeaderServiceImpl extends BaseServiceImpl<TaskHeader> implements ITaskHeaderService {
    @Resource
    private TaskHeaderMapper taskHeaderMapper;

    @Resource
    private TaskLineMapper taskLineMapper;

    /**
     * 关联查询用户名,数据类型名称,系统名称
     * @param request request
     * @param taskHeader taskHeader实体类
     * @param pageNum 页数
     * @param pageSize 页面数量
     * @return taskHeader实体类集合
     */
    @Override
    public List<TaskHeader> select(IRequest request, TaskHeader taskHeader, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return taskHeaderMapper.select(taskHeader);
    }


    @Override
    public int batchDelete(List<TaskHeader> list) {
        for (TaskHeader taskHeader: list){
            taskLineMapper.deleteById(taskHeader.getItemHeaderId());
        }
        return super.batchDelete(list);
    }
}
