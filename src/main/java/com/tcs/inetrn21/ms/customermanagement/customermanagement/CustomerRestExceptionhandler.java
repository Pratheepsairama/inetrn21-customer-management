package com.tcs.inetrn21.ms.customermanagement.customermanagement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class CustomerRestExceptionhandler {
	@ExceptionHandler
	public ResponseEntity <CustomerErrorResponsePage> handleException(CustomerNotFoundExceptionClass exc)
	{
		CustomerErrorResponsePage error = new CustomerErrorResponsePage(HttpStatus.NOT_FOUND.value(),
				                              exc.getMessage(),
				                              System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponsePage> handleException(Exception exc)
	{
		CustomerErrorResponsePage error = new CustomerErrorResponsePage(HttpStatus.BAD_REQUEST.value(),
				                              exc.getMessage(),
				                              System.currentTimeMillis());
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
}
