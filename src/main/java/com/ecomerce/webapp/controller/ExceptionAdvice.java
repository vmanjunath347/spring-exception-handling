package com.ecomerce.webapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ecomerce.webapp.exceptions.CustomException;

@RestControllerAdvice
public class ExceptionAdvice {
	
	@ExceptionHandler(value = NotFoundException.class)
	public ResponseEntity<Object> exception(CustomException exception){
		return new ResponseEntity<Object>("Global Not Found !",HttpStatus.NOT_FOUND);
	}

}
