package com.scg.employeemanagement.vo;

import java.util.List;

import com.scg.employeemanagement.dao.entity.Employee;

import lombok.Data;



@Data

public class DepartmentVO {

	private int departmentId;
	private String departmentName;
	private List<EmployeeVO> employees;
	private AuditVO audit;
	
	
	
}
