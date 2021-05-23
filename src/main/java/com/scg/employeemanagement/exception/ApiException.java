package com.scg.employeemanagement.exception;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ApiException extends RuntimeException {

	  private static final long serialVersionUID = 1L;
	  private  ErrorCode errorCode;
	  public ApiException(final ErrorCode errorCode) {
	    
		this.errorCode= errorCode;
	  }
	
	}