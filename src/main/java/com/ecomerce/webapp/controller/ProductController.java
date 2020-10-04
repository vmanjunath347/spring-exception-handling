package com.ecomerce.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ProductController {
	
	@RequestMapping(value="/product/{id}", method=RequestMethod.GET)
	@ResponseBody
	public String getProducts(@PathVariable("id") String id) {
		if(id.contentEquals("0")) {
			throw new NotFoundException("Not Found!");
		}
		return "Product is Available , very nice product";
	}

}
