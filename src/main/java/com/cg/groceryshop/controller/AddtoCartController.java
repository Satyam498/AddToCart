package com.cg.groceryshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.groceryshop.service.AddtoCartService;



public class AddtoCartController {

	@Autowired
	private AddtoCartService service;
	
	public List<String> productStatus(@PathVariable String productId)
	{
		
		return service.forProductStatus(productId);
	
				
	}
	
	
	public String productBooking(@PathVariable String productId,@PathVariable String productName)
	{
		
		return service.forProductBooking(productId,productName);
	}	
}
