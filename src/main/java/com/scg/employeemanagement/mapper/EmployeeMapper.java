package com.scg.employeemanagement.mapper;

import java.util.List;

import org.mapstruct.Mapper;


import com.scg.employeemanagement.dao.entity.Employee;
import com.scg.employeemanagement.vo.EmployeeVO;

//@Mapper(componentModel = "spring")
@Mapper(componentModel = "spring", uses = {AuditMapper.class,AccountMapper.class})

public interface EmployeeMapper {
	
	
	EmployeeVO  toVO(Employee employee);
	List<EmployeeVO>  toVO (List<Employee> list);
	Employee toEntity(EmployeeVO employeeVo);
}
