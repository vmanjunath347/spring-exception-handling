package com.ecomerce.webapp.controller;

public class NotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	NotFoundException(String msg){
		super(msg);
	}
}
