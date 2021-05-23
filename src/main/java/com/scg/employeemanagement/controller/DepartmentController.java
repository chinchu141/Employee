package com.scg.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.employeemanagement.service.DepartmentService;
import com.scg.employeemanagement.vo.DepartmentVO;

@RestController
@RequestMapping("/department")

public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	// add department
	@PostMapping
	public DepartmentVO addDepartment(@RequestBody final DepartmentVO departmentVO) {

		return departmentService.addDepartment(departmentVO);
	}

	// displaying list of all department
	@GetMapping("list")
	public List<DepartmentVO> getAllDepartment() {
		return departmentService.getAllDepartments();
	}

	// displaying department by id
	@GetMapping("/{id}")
	public DepartmentVO getDepartment(@PathVariable int id) {
		return departmentService.getDepartment(id);
	}

	// delete department by id
	@DeleteMapping("/{id}")
	public void deleteDepartmentById(@PathVariable int id) {
		departmentService.deleteDepartmentById(id);
	}

}
