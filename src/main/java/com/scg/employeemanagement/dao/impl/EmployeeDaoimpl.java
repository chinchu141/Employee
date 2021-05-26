package com.scg.employeemanagement.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.scg.employeemanagement.LogExecutionTime;
import com.scg.employeemanagement.dao.EmployeeDao;
import com.scg.employeemanagement.dao.entity.Employee;
import com.scg.employeemanagement.dao.repository.EmployeeRepository;
import com.scg.employeemanagement.exception.ApiException;
import com.scg.employeemanagement.exception.ErrorCode;
import com.scg.employeemanagement.exception.Validator;
import com.scg.employeemanagement.mapper.EmployeeMapper;

import com.scg.employeemanagement.vo.EmployeeVO;

@Component
public class EmployeeDaoimpl implements EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeMapper employeeMapper;

	@LogExecutionTime
	@Override
	public EmployeeVO addEmployee(EmployeeVO employeeVO) {
		Validator.validate(employeeVO);
		
		return employeeMapper.toVO(employeeRepository.save(employeeMapper.toEntity(employeeVO)));

	}

	
	@Override
	public List<EmployeeVO> getEmployees() {
		
		return employeeMapper.toVO(employeeRepository.findAll());

	}
	
//	@Override
//	public List<EmployeeVO> getEmployeeByName(String name) {
//		
//		return employeeMapper.toVO(employeeRepository.findByemployeeNameContaining();
//
//
//	}

    @LogExecutionTime
	@Override
	public String deleteEmployee(int id) {
	
		getEmployeeById(id);
		
		
		employeeRepository.deleteById(id);
		return "Employee id : " + id + " Removed";

	}
 
	@Override
	public EmployeeVO updateEmployee(EmployeeVO employeeVO) {
		Validator.validate(employeeVO);
		Employee employee = employeeMapper.toEntity(employeeVO);
		Employee existingEmployee =employeeRepository.findById(employee.getEmployeeId()).orElseThrow(() -> new ApiException(ErrorCode.EMPLOYEE_NOT_FOUND));
		existingEmployee.setEmployeeName(employee.getEmployeeName());
		existingEmployee.setAccounts(employee.getAccounts());
		return employeeMapper.toVO(employeeRepository.save(existingEmployee));

	}
	@Override
	public EmployeeVO getEmployeeById(final int id) {
		Validator.validateId(id);
		return  employeeMapper.toVO(employeeRepository.findById(id).orElseThrow(() -> new ApiException(ErrorCode.EMPLOYEE_NOT_FOUND)));
		
		

	}


	@Override
	public List<String> getDepartmentNameByEmployeeId(int id) {
		
		return employeeRepository.findDepartmentByEmployeeId(id);
	}


	@Override
	public List<String> getEmployeeAndDepartmentName() {
		
		return employeeRepository.findEmployeeAndDepartmentName();
	}


	@Override
	public List<String> getAccountDetailsByEmployeeId(int id) {

		return employeeRepository.findAccountDetailsByEmployeeId(id);
	}

}
