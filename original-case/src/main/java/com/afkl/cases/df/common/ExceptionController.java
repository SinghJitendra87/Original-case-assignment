package com.afkl.cases.df.common;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(Throwable.class)
	public HttpEntity<Object> handleGlobalException(Throwable t) {
		return new ResponseEntity<Object>("Global Exception", SERVICE_UNAVAILABLE);
	}

	@ExceptionHandler(HttpServerErrorException.class)
	public HttpEntity<Object> handleGlobalException(HttpServerErrorException e) {
		return new ResponseEntity<>("ServerErrorException", e.getStatusCode());
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public HttpEntity<Object> handleBadRequest() {
		return new ResponseEntity<>("IllegalArgumentException", BAD_REQUEST);
	}

}
