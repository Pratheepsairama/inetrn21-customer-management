package com.tcs.inetrn21.ms.customermanagement.customermanagement;

public class CustomerErrorResponsePage {
	private int status;
	private String message;
	private long timestamp;
	
	public CustomerErrorResponsePage() {
		
	}

	public CustomerErrorResponsePage(int status, String message, long timestamp) {
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	


}
