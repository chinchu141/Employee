package com.scg.employeemanagement.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class AccountVO {

	private String accountNumber;
	private String branch;
	private String ifsc;

	// private Employee employee;

}
