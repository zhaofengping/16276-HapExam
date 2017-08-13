package hbi.core.hss.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.hss.dto.TaskLine;
import hbi.core.hss.service.ITaskLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * TaskLineController
 * Created by 谢子曦 on 2016/12/20
 */
@Controller
public class TaskLineController extends BaseController {

    @Autowired
    private ITaskLineService taskLineService;

    /**
     * 通过itemHeaderId带出最大行号+1
     * @param itemHeaderId itemHeaderId
     * @return {SeqMum:int}
     */
    @RequestMapping(value = "/TaskLine/getSeqMum", method = RequestMethod.GET)
    @ResponseBody
    public Long findMaxSeqNum(@RequestParam Long itemHeaderId) {
        return taskLineService.findMaxSeqNum(itemHeaderId);
    }

    /**
     * 获取所有任务行基本信息(含分页)
     * @param request 请求方式POST
     * @param taskLine  行信息查询条件
     * @return  List<TaskLine> 行信息list
     */
    @RequestMapping(value = "/TaskLine/query", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData query(HttpServletRequest request, TaskLine taskLine, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int pagesize) {
        IRequest iRequest = createRequestContext(request);
        return new ResponseData(taskLineService.select(iRequest,taskLine,page,pagesize));
    }


    /**
     * 插入一条任务行基本信息
     * @param request 请求方式PUT
     * @return 成功(lineList),失败(false)
     */
    @RequestMapping(value = "/TaskLine/insert", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseData insert(HttpServletRequest request,@RequestBody TaskLine taskLine) {
        IRequest iRequest = createRequestContext(request);
        List<TaskLine> lineList = new ArrayList<>();
        return new ResponseData(lineList.add(taskLineService.insertSelective(iRequest,taskLine)));
    }

    /**
     * 更新一条任务行基本信息
     * @param lineList 将要被更新的任务行基本信息
     * @return 成功(true),失败(false)
     */
    @RequestMapping(value = {"/TaskLine/update"}, method = {RequestMethod.PUT})
    public ResponseData update(HttpServletRequest request,@RequestBody List<TaskLine> lineList){
        IRequest iRequest = createRequestContext(request);
        return new ResponseData(taskLineService.batchUpdate(iRequest,lineList));
    }

    /**
     * 批量删除任务行基本信息
     * @param taskLines 将要被删除的任务行基本信息list
     * @return List<TaskHeader> 被删除的任务行基本信息list
     */
    @RequestMapping(value = {"/TaskLine/remove"}, method = {RequestMethod.DELETE})
    public ResponseData remove(@RequestBody List<TaskLine> taskLines) {
        taskLineService.batchDelete(taskLines);
        return new ResponseData(taskLines);
    }

}
