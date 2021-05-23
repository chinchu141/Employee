package com.scg.employeemanagement.vo;

import java.util.List;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeVO {

	private int employeeId;
	private String employeeName;
	private List<AccountVO> accounts;
	private AuditVO audit;

}
