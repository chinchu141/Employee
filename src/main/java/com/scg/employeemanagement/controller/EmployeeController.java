package com.scg.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.employeemanagement.service.EmployeeService;
import com.scg.employeemanagement.vo.EmployeeVO;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@PostMapping
	public ResponseEntity<EmployeeVO> addEmployee(@RequestBody final EmployeeVO employeeVO) {

		return new ResponseEntity<>(employeeService.addEmployee(employeeVO), HttpStatus.CREATED);
	}

//	@PostMapping
//	public EmployeeVO addEmployee(@RequestBody final EmployeeVO employee) {
//		return employeeService.addEmployee(employee);
//	}

	@GetMapping("/list")
	public ResponseEntity<List<EmployeeVO>> getEmployee() {

		return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
	}
	

	@DeleteMapping("{id}")
	public void deleteEmployee(@PathVariable final int id) {
		employeeService.deleteEmployee(id);
	}

	@PutMapping
	public EmployeeVO updateEmployee(@RequestBody final EmployeeVO employeeVO) {
		return employeeService.updateEmployee(employeeVO);
	}

	@GetMapping("{id}")
	public ResponseEntity<EmployeeVO> getEmployeeById(@PathVariable final int id) {

		return new ResponseEntity<>(employeeService.getEmployeeById(id), HttpStatus.OK);

	}
	@GetMapping("deptby/{id}")
	public List<String> getDepartmentNameByEmployeeId(@PathVariable final int id) {
		
		return employeeService.getDepartmentNameByEmployeeId(id);

	}
		
	@GetMapping("account/{id}")
	public List<String> getAccountDetailsByEmployeeId(@PathVariable final int id) {
		
		return employeeService.getAccountDetailsByEmployeeId(id);

	}
	
	@GetMapping("list/dept")
	public  List<String> getEmployeeAndDepartmentName() {
       return employeeService.getEmployeeAndDepartmentName();

	}

}
