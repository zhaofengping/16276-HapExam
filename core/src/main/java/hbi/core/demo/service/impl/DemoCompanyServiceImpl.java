package hbi.core.demo.service.impl;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import hbi.core.demo.dto.Employee;
import org.springframework.stereotype.Service;
import hbi.core.demo.dto.Company;
import hbi.core.demo.service.IDemoCompanyService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class DemoCompanyServiceImpl extends BaseServiceImpl<Company> implements IDemoCompanyService {

    @Override
    public List<Employee> selectAll1(IRequest request, Employee emp, int pageNum, int pageSize) {
        return null;
    }
}