package com.scg.employeemanagement.exception;

public enum ErrorCode {

	EMPLOYEE_NOT_FOUND("employee id is not found"), INVALID_NAME("Name format is invalid"),
	DEPARTMENT_NOT_FOUND("department id is invalid"), INVALID_ID("id is invalid ,must greater than 0");

	private final String msg;

	private ErrorCode(String msg) {

		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
