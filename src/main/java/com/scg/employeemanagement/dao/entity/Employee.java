package com.scg.employeemanagement.dao.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "employee")
@EntityListeners(AuditListener.class)
public class Employee implements Auditable {

	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId;

	@Column(name = "employee_name")
	private String employeeName;

	@OneToMany(targetEntity = Account.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(referencedColumnName = "employee_id")
	private List<Account> accounts;

	@Embedded
	private Audit audit;

}
