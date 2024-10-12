package com.syed.springbootrediscache.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException
{
	private static final long serialVersionUID = -2475899917293054002L;
	
	public ResourceNotFound(String message)
	{
		super(message);
	
	}
	
}