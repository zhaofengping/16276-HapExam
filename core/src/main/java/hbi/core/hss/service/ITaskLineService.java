package hbi.core.hss.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.core.hss.dto.TaskLine;

import java.util.List;

/**
 * Created by 谢子曦 on 2016/12/22
 */

public interface ITaskLineService extends IBaseService<TaskLine>,ProxySelf<ITaskHeaderService> {

    Long findMaxSeqNum(Long itemHeaderId);

    Integer deleteById(Long itemHeaderId);

}
