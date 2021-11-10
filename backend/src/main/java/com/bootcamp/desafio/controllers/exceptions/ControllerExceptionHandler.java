package com.bootcamp.desafio.controllers.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bootcamp.desafio.services.exceptions.DataBaseException;
import com.bootcamp.desafio.services.exceptions.ServiceNotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(ServiceNotFoundException.class)
	public ResponseEntity<StandardError> serviceNotFound(ServiceNotFoundException e, HttpServletRequest request) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError();
		err.setError("Controller not found");
		err.setMessage(e.getMessage());
		err.setPath(request.getRequestURI());
		err.setStatus(status.value());
		err.setTimestamp(Instant.now());
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DataBaseException.class)
	public ResponseEntity<StandardError> database(DataBaseException e, HttpServletRequest request) {
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError();
		err.setError("Controller not found");
		err.setMessage(e.getMessage());
		err.setPath(request.getRequestURI());
		err.setStatus(status.value());
		err.setTimestamp(Instant.now());
		return ResponseEntity.status(status).body(err);
	}

}
