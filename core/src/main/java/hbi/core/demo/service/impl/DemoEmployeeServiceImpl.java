package hbi.core.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.mapper.DemoEmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hbi.core.demo.dto.Employee;
import hbi.core.demo.service.IDemoEmployeeService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class DemoEmployeeServiceImpl extends BaseServiceImpl<Employee> implements IDemoEmployeeService {
    @Autowired
    private DemoEmployeeMapper mapper;


    @Override
    public List<Employee> selectAll1(IRequest request, Employee emp, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return mapper.selectAll1(emp);
    }
}