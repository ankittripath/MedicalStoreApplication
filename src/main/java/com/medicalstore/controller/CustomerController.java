package com.medicalstore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicalstore.dto.CustomerDto;
import com.medicalstore.entity.Customer;
import com.medicalstore.exception.CustomerNotFoundException;
import com.medicalstore.exception.MedicalNotFoundException;
import com.medicalstore.repository.CustomerRepository;
import com.medicalstore.services.CustomerService;

@RestController
public class CustomerController {
	
	
	@Autowired
	CustomerService customerservice;
	
	@Autowired
	CustomerRepository customerrepository;
	
	 @GetMapping("/customer")
	 public List<Customer> showcustomer(Customer customer) {
		 return customerrepository.findAll();
	 }
	
	
	@PostMapping("/addcustomer/{medicalId}")
	public Customer addcustomer(@RequestBody @Valid CustomerDto customerdto,@PathVariable int medicalId) throws MedicalNotFoundException {
		return customerservice.addcustomerInfo(customerdto,medicalId);
	}
	
	
	@PutMapping("/updatecustomer/{customerId}")
	public Customer updatecustomer(@RequestBody @Valid CustomerDto customerdto,@PathVariable int customerId) {
		return customerservice.updatecustomerinfo(customerdto,customerId);
	}
	
	@GetMapping("/getbycustomername/{customerName}")
	public List<Customer> getbycustomername(@PathVariable String customerName) throws CustomerNotFoundException{
		return customerservice.getbycustomername(customerName);
	}
	
	@GetMapping("/customercontains/{customerName}")
	public List<Customer> customercontains(@PathVariable String customerName) throws CustomerNotFoundException{
		return customerservice.customercontainsinfo(customerName);
	}
	
	@GetMapping("/customerendswith/{customerName}")
	public List<Customer> customerendswith(@PathVariable String customerName) throws CustomerNotFoundException{
		return customerservice.customerendswithinfo(customerName);
	}
	
	@GetMapping("/customerstartswith/{customerName}")
	public List<Customer> customerstartswith(@PathVariable String customerName) throws CustomerNotFoundException{
		return customerservice.customerstartswithinfo(customerName);
	}
	

}
