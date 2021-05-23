package com.scg.employeemanagement.dao.entity;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.scg.employeemanagement.dao.audit.AuditListener;
import com.scg.employeemanagement.dao.audit.Auditable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@Table(name = "department_details")
@EntityListeners(AuditListener.class)
public class Department implements Auditable {

	@Id
	@Column(name = "dept_id", unique = true, nullable = false)
	private Integer departmentId;

	@Column(name = "dept_name", unique = true, length = 100)
	private String departmentName;

	@OneToMany(targetEntity = Employee.class, cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "dept_id")
	private List<Employee> employees;
	
	@Embedded
	private Audit audit;

	
}
