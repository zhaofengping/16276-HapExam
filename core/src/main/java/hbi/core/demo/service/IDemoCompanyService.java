package hbi.core.demo.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import hbi.core.demo.dto.Company;
import hbi.core.demo.dto.Employee;

import java.util.List;

public interface IDemoCompanyService extends IBaseService<Company>, ProxySelf<IDemoCompanyService>{
    List<Employee> selectAll1(IRequest request, Employee emp, int pageNum, int pageSize);
}