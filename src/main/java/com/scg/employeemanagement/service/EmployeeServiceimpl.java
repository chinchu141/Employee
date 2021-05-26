package com.scg.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.scg.employeemanagement.dao.EmployeeDao;

import com.scg.employeemanagement.vo.EmployeeVO;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public EmployeeVO addEmployee(EmployeeVO employeeVO) {
		
		return employeeDao.addEmployee(employeeVO);
	}
    
	@Override
	public List<EmployeeVO> getEmployees() {
       
		return employeeDao.getEmployees();
	}

	@Override
	public void deleteEmployee(int id) {

		System.out.println(employeeDao.deleteEmployee(id));
		

	}

	@Override
	public EmployeeVO updateEmployee(EmployeeVO employeeVO) {

		return employeeDao.updateEmployee(employeeVO);
	}

	@Override
	public EmployeeVO getEmployeeById(int id) {
		
		return employeeDao.getEmployeeById(id);
	}

	

	@Override
	public List<String> getDepartmentNameByEmployeeId(int id) {
		
		return employeeDao.getDepartmentNameByEmployeeId(id);
	}

	@Override
	public List<String> getEmployeeAndDepartmentName() {
		
		return employeeDao.getEmployeeAndDepartmentName();
	}

	@Override
	public List<String> getAccountDetailsByEmployeeId(int id) {
		// TODO Auto-generated method stub
		return employeeDao.getAccountDetailsByEmployeeId(id);
	}

		
	
}
