package com.scg.employeemanagement.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.employeemanagement.dao.DepartmentDao;
import com.scg.employeemanagement.dao.repository.DepartmentRepository;
import com.scg.employeemanagement.exception.ApiException;
import com.scg.employeemanagement.exception.ErrorCode;
import com.scg.employeemanagement.exception.Validator;
import com.scg.employeemanagement.mapper.DepartmentMapper;
import com.scg.employeemanagement.vo.DepartmentVO;


@Component
public class DepartmentDaoimpl implements DepartmentDao {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private DepartmentMapper departmentMapper;

	@Override
	public DepartmentVO addDepartment(DepartmentVO departmentVO) {
        Validator.validateDepartment(departmentVO);
		return departmentMapper.toVO(departmentRepository.save(departmentMapper.toEntity(departmentVO)));

	}

	@Override
	public List<DepartmentVO> getAllDepartments() {
       
		return departmentMapper.toVO(departmentRepository.findAll());
	}

	@Override
	public DepartmentVO getDepartment(int id) {
		Validator.validateId(id);
		return departmentMapper.toVO(
				departmentRepository.findById(id).orElseThrow(() -> new ApiException(ErrorCode.DEPARTMENT_NOT_FOUND)));

	}

	@Override
	public String deleteEmployee(int id) {
		getDepartment(id);
		departmentRepository.deleteById(id);
		return "Employee id : " + id + " Removed";
	}
}
