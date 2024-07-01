package com.jwt.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidCredentialException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidCredentialException(String message) {
        super(message);
    }
}
