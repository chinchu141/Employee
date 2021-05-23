package com.scg.employeemanagement.service;

import java.util.List;

import com.scg.employeemanagement.vo.DepartmentVO;

public interface DepartmentService {

	
	DepartmentVO addDepartment(DepartmentVO departmentVO);

	List<DepartmentVO> getAllDepartments();

	 DepartmentVO  getDepartment(int id);

	void deleteDepartmentById(int id);

	
}
