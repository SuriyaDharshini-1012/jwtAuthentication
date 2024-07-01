package com.jwt.example.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class EmailNotFoundException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		public EmailNotFoundException(String message) {
	        super(message);
	    }

}
