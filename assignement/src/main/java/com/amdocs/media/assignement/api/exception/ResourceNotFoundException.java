package com.amdocs.media.assignement.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -6252766749487342137L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
