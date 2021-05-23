package com.scg.employeemanagement.dao.entity;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "account_details")
@Getter
@Setter

public class Account {

	@Id
	@Column(name = "acc_number", unique = true, nullable = false)
	private String accountNumber;

	@Column(name = "bank_branch")
	private String branch;

	@Column(name = "bank_ifsc")
	private String ifsc;

	

}