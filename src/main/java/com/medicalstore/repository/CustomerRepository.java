package com.medicalstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicalstore.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	List<Customer> findByCustomerName(String customerName);
	
	
	List<Customer> findByCustomerNameContains(String customerName);
	
	List<Customer> findByCustomerNameEndsWith(String customerName);
	
	List<Customer> findByCustomerNameStartsWith(String customerName);
}
