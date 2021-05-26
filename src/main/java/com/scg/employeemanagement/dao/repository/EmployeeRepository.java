package com.scg.employeemanagement.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.scg.employeemanagement.dao.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value="select department_details.dept_name from department_details inner join employee on department_details.dept_id=employee.employees_dept_id and employee_id = ?1 ",nativeQuery = true)
	public List<String> findDepartmentByEmployeeId(int id);
	
    @Query(value="select a.acc_number,a.bank_branch from account_details a inner join  employee e on a.accounts_employee_id=e.employee_id  and employee_id = ?1 ",nativeQuery = true)
	public List<String>  findAccountDetailsByEmployeeId(int id);
    
	@Query(value="select employee.employee_name ,department_details.dept_name from employee inner join department_details on employee.employees_dept_id =department_details.dept_id",nativeQuery = true)
	public List<String> findEmployeeAndDepartmentName();
}

