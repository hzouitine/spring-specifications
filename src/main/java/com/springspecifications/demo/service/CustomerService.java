package com.springspecifications.demo.service;

import com.springspecifications.demo.model.Customer;

public interface CustomerService {

	Customer save(Customer c);
	Customer findById(Long id);
}
