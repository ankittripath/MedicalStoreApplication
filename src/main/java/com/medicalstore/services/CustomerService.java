package com.medicalstore.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalstore.dto.CustomerDto;
import com.medicalstore.entity.Customer;
import com.medicalstore.entity.MedicalStore;
import com.medicalstore.exception.CustomerNotFoundException;
import com.medicalstore.exception.MedicalNotFoundException;
import com.medicalstore.repository.CustomerRepository;
import com.medicalstore.repository.MedicalStoreRepository;

@Service
public class CustomerService {
	
	@Autowired
	public CustomerRepository customerrepository;
	
	
	@Autowired
	public MedicalStoreRepository medicalstorerepository;

	public Customer addcustomerInfo(CustomerDto customerdto,int medicalId) throws MedicalNotFoundException {
		// TODO Auto-generated method stub
		 MedicalStore medicalstore = medicalstorerepository.findById(medicalId).orElseThrow((()->new MedicalNotFoundException("medical is not present")));
		Customer customer = new Customer();
		
		customer.setCustomerName(customerdto.getCustomerName());
		customer.setCustomerAddress(customerdto.getCustomerAddress());
		customer.setCustomerMobileNumber(customerdto.getCustomerMobileNumber());
		customer.setCustomerAge(customerdto.getCustomerAge());
		customer.setMedicalstore(medicalstore);
	
		customer.setCustomerMeritalStatus(customerdto.getCustomerMeritalStatus());
		
		return customerrepository.save(customer);
	}

	public Customer updatecustomerinfo(@Valid CustomerDto customerdto, int customerId) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setCustomerId(customerdto.getCustomerId());
		customer.setCustomerName(customerdto.getCustomerName());
		customer.setCustomerAddress(customerdto.getCustomerAddress());
		customer.setCustomerMobileNumber(customerdto.getCustomerMobileNumber());
		customer.setCustomerAge(customerdto.getCustomerAge());
		customer.setCustomerMeritalStatus(customerdto.getCustomerMeritalStatus());
		return customerrepository.save(customer);
	}

	public List<Customer> getbycustomername(String customerName) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		 if(customerrepository.findByCustomerName(customerName).isEmpty()) {
			 throw new CustomerNotFoundException("Custoer is Not Found");
		 }else {
			 return customerrepository.findByCustomerName(customerName);
		 }
	}

	public List<Customer> customercontainsinfo(String customerName) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		if(customerrepository.findByCustomerNameContains(customerName).isEmpty()) {
			throw new CustomerNotFoundException("Your information is not contains");
		}else {
		
			return customerrepository.findByCustomerNameContains(customerName);
		}
		 
	}

	public List<Customer> customerendswithinfo(String customerName) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		if(customerrepository.findByCustomerNameEndsWith(customerName).isEmpty()) {
			throw new CustomerNotFoundException("Your information is not contains");
		}
		else {
			return customerrepository.findByCustomerNameEndsWith(customerName);
		}
	
	}

	public List<Customer> customerstartswithinfo(String customerName) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		if(customerrepository.findByCustomerNameStartsWith(customerName).isEmpty()) {
			throw new CustomerNotFoundException(customerName);
		}else {
		 return customerrepository.findByCustomerNameStartsWith(customerName);	
		}
		
	}

	 
	 
	
	
	

	 
}
