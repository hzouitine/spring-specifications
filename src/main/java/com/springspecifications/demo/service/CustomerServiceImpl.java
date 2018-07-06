package com.springspecifications.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springspecifications.demo.model.Customer;
import com.springspecifications.demo.repository.CustomerRepository;
import com.springspecifications.demo.specifications.CustomerSpecifications;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	
	@Override
	public Customer save(Customer c) {
		// TODO Auto-generated method stub
		return customerRepository.save(c);
	}

	@Override
	public Customer findById(Long id) {
		if(customerRepository.findOne(CustomerSpecifications.customerHasID(id)).isPresent())
			return (Customer) customerRepository.findOne(CustomerSpecifications.customerHasID(id)).get();
		return null;
	}

}
