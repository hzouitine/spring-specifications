package com.springspecifications.demo.specifications;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.springspecifications.demo.model.Customer;
import com.springspecifications.demo.model.Customer_;

public class CustomerSpecifications {

	public static Specification<Customer> customerHasID(Long id) {
	    return new Specification<Customer>() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				// TODO Auto-generated method stub
		        return criteriaBuilder.equal(root.get(Customer_.id), id);
			}
		};
	  }
	
}
