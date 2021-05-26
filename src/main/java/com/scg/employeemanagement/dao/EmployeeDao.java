package com.scg.employeemanagement.dao;

import java.util.List;

import com.scg.employeemanagement.vo.EmployeeVO;

public interface EmployeeDao {

	EmployeeVO addEmployee(final EmployeeVO employeeVO);

	List<EmployeeVO> getEmployees();

	String deleteEmployee(int id);

	EmployeeVO updateEmployee(EmployeeVO employeeVO);

	EmployeeVO getEmployeeById(final int id);

	List<String> getDepartmentNameByEmployeeId(final int id);

	List<String> getEmployeeAndDepartmentName();
	
	List<String> getAccountDetailsByEmployeeId(int id);

}
