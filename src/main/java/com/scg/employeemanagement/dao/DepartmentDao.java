package com.scg.employeemanagement.dao;

import java.util.List;

import com.scg.employeemanagement.vo.DepartmentVO;

public interface DepartmentDao {

	DepartmentVO addDepartment(DepartmentVO departmentVO);

	List<DepartmentVO> getAllDepartments();

	 DepartmentVO  getDepartment(int id);

	String deleteEmployee(int id);
}
