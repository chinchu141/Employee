package com.scg.employeemanagement.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scg.employeemanagement.dao.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
