package com.scg.employeemanagement.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.scg.employeemanagement.dao.entity.Department;
import com.scg.employeemanagement.vo.DepartmentVO;

	@Mapper(componentModel = "spring", uses = AuditMapper.class)
		
	
	public interface DepartmentMapper {
		
		Department toEntity (DepartmentVO departmentVO);
		
		List<DepartmentVO>  toVO (List<Department> list);
		DepartmentVO  toVO (Department department);
		

	}
