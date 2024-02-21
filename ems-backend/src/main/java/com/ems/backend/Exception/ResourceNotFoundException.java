package com.ems.backend.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.annotation.Resource;

@ResponseStatus( value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends RuntimeException{
	
	

	public ResourceNotFoundException(String message) {
		super(message);
	}

}
