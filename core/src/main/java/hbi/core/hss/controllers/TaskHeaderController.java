package hbi.core.hss.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import hbi.core.hss.dto.TaskHeader;
import hbi.core.hss.service.ITaskHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 谢子曦 on 2016/12/20
 */
@Controller
public class TaskHeaderController extends BaseController {

    @Autowired
    private ITaskHeaderService taskHeaderService;

    /**
     * 获取所有任务头基本信息(含分页)
     * @param request  请求方式GET
     * @param taskHeader 头信息查询条件
     * @return  List<TaskHeader> 头信息list
     */
    @RequestMapping(value = "/TaskHeader/query", method = RequestMethod.GET)
    @ResponseBody
    public ResponseData query(HttpServletRequest request,TaskHeader taskHeader, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int pagesize) {
        IRequest iRequest = createRequestContext(request);
        List<TaskHeader> headersList = taskHeaderService.select(iRequest,taskHeader,page,pagesize);
        return new ResponseData(headersList);
    }

    /**
     * 插入一条任务头基本信息
     * @param request 请求方式 PUT
     * @return 任务头信息list(成功),false(失败)
     */
    @RequestMapping(value = "/TaskHeader/insert", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseData insert(HttpServletRequest request,@RequestBody TaskHeader taskHeader) {
        IRequest iRequest = createRequestContext(request);
        List<TaskHeader> headerList = new ArrayList<>();
        ResponseData responseData = new ResponseData();
        try{
            headerList.add(taskHeaderService.insertSelective(iRequest,taskHeader));
            responseData.setRows(headerList);
            responseData.setMessage("新建成功");
        }catch (Exception e){
            responseData.setSuccess(false);
            responseData.setMessage("存在相同的记录");
            return responseData;
        }
        return responseData;
    }

    /**
     * 批量删除任务头基本信息
     * @param taskHeaders 将要被删除的任务头基本信息list
     * @return List<TaskHeader> 被删除的任务头基本信息list
     */
    @RequestMapping(value = {"/TaskHeader/remove"}, method = {RequestMethod.DELETE})
    public ResponseData remove(@RequestBody List<TaskHeader> taskHeaders) {
        ResponseData responseData = new ResponseData();
        try{
            taskHeaderService.batchDelete(taskHeaders);
            responseData.setRows(taskHeaders);
            responseData.setMessage("删除成功");
        }catch (Exception e){
            responseData.setSuccess(false);
        }
        return responseData;
    }

    /**
     * 更新一条任务头基本信息
     * @param taskHeader 将要被更新的任务头基本信息
     * @return 成功(list用于更新版本号),失败(false)
     */
    @RequestMapping(value = {"/TaskHeader/update"}, method = {RequestMethod.PUT})
    public ResponseData update(HttpServletRequest request, @RequestBody TaskHeader taskHeader){
        IRequest iRequest = createRequestContext(request);
        List<TaskHeader> headerList = new ArrayList<>();
        ResponseData responseData = new ResponseData();
        try {
            headerList.add(taskHeaderService.updateByPrimaryKeySelective(iRequest,taskHeader));
            responseData.setMessage("更新成功");
            responseData.setRows(headerList);
        }catch (Exception e){
            responseData.setSuccess(false);
            responseData.setMessage("存在相同的记录");
            return responseData;
        }
        return responseData;
    }
}
