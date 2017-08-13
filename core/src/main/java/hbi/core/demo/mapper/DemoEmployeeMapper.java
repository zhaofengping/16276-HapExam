package hbi.core.demo.mapper;

import com.hand.hap.mybatis.common.Mapper;
import hbi.core.demo.dto.Employee;

import java.util.List;

public interface DemoEmployeeMapper extends Mapper<Employee>{

    List<Employee> selectAll1(Employee emp);
}