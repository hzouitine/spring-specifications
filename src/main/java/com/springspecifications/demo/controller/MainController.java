package com.springspecifications.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springspecifications.demo.model.Customer;
import com.springspecifications.demo.service.CustomerService;

@RestController
public class MainController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/save")
	public String save(){
		for(int i=0;i<5;i++){
			customerService.save(new Customer("first"+i,"last"+i));
		}
		return "saved";
	}
	
	@RequestMapping("/find/{id}")
	public Customer find(@PathVariable Long id){
		return customerService.findById(id);
	}

}
