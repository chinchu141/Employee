package com.scg.employeemanagement.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ApiExceptionHandler {

  @ExceptionHandler(ApiException.class)
  @ResponseStatus
  public ResponseMessage customeException(ApiException ex, WebRequest request) {
	  ResponseMessage message = new ResponseMessage(HttpStatus.NOT_FOUND.value(),new Date(),ex.getErrorCode().getMsg(),request.getDescription(false) );
	   return message;
  }
  
  

@ExceptionHandler(Exception.class)
  @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
  public ResponseMessage globalExceptionHandler(Exception ex, WebRequest request) {
    ResponseMessage message = new ResponseMessage(HttpStatus.NOT_FOUND.value(),new Date(),ex.getMessage(),""); 
    return message;
  }
}