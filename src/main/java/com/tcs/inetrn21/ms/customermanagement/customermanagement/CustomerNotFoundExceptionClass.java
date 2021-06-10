package com.tcs.inetrn21.ms.customermanagement.customermanagement;

public class CustomerNotFoundExceptionClass extends RuntimeException {
public CustomerNotFoundExceptionClass() {
		
	}

	public CustomerNotFoundExceptionClass(String message) {
		super(message);
		
	}

	public CustomerNotFoundExceptionClass(Throwable cause) {
		super(cause);
		
	}

	public CustomerNotFoundExceptionClass(String message, Throwable cause) {
		super(message, cause);
		
	}

	public CustomerNotFoundExceptionClass(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
