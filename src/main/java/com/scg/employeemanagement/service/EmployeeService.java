package com.scg.employeemanagement.service;

import java.util.List;


import com.scg.employeemanagement.vo.EmployeeVO;

public interface EmployeeService {
	EmployeeVO addEmployee(final EmployeeVO employeeVO);

	List<EmployeeVO> getEmployees();

	void deleteEmployee(final int id);

	EmployeeVO updateEmployee(EmployeeVO employeeVO);

	EmployeeVO getEmployeeById(final int id);

	
	List<String> getDepartmentNameByEmployeeId(final int id);
	
	List<String> getEmployeeAndDepartmentName();
	
	List<String> getAccountDetailsByEmployeeId(final int id);
 
}
