package com.springspecifications.demo.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.springspecifications.demo.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>, JpaSpecificationExecutor {

}
