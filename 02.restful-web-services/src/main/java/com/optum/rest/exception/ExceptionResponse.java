package com.optum.rest.exception;

import java.util.Date;

public class ExceptionResponse {
	private Date timestamp;
	private String message;
	private String details;
	private String owner;
	

	public ExceptionResponse(Date timestamp, String message, String details, String owner) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.owner = owner;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	public String getOwner() {
		return owner;
	}
}
