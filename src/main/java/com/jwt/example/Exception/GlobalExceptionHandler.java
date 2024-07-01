package com.jwt.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jwt.example.dto.ErrorResponse;


@ControllerAdvice
public class GlobalExceptionHandler
{
	   @ExceptionHandler(EmailNotFoundException.class)
	    public ResponseEntity<ErrorResponse> handleEmailNotFoundException(EmailNotFoundException ex) {
		   ErrorResponse errorResponse = new ErrorResponse(HttpStatus.UNAUTHORIZED.value(), ex.getMessage());
	        return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
	    }

	    @ExceptionHandler(InvalidCredentialException.class)
	    public ResponseEntity<ErrorResponse> handleInvalidPasswordException(InvalidCredentialException ex) {
	        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.UNAUTHORIZED.value(), ex.getMessage());
	        return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
	    }

}
