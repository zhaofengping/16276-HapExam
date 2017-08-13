package hbi.core.hss.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.hss.dto.TaskHeader;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 谢子曦 on 2016/12/20
 */
@Repository(value = "taskHeaderMapper")
public interface TaskHeaderMapper extends Mapper<TaskHeader> {

    /**
     * 关联查询用户名,数据类型名称,系统名称
     */
    List<TaskHeader> select(TaskHeader taskHeader);

}
