package com.medicalstore.dto;

 

 

public class CustomerDto {
 
	private int customerId;
	
	 
	private String customerName;
	
	 
	private String customerAddress;
	
	 
	private String customerMobileNumber;
	
	 
	private String customerAge;
	
	 
	private String customerMeritalStatus;


	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CustomerDto(String customerName, String customerAddress, String customerMobileNumber, String customerAge,
			String customerMeritalStatus) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerMobileNumber = customerMobileNumber;
		this.customerAge = customerAge;
		this.customerMeritalStatus = customerMeritalStatus;
	}


	public CustomerDto(int customerId, String customerName, String customerAddress, String customerMobileNumber,
			String customerAge, String customerMeritalStatus) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerMobileNumber = customerMobileNumber;
		this.customerAge = customerAge;
		this.customerMeritalStatus = customerMeritalStatus;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}


	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}


	public String getCustomerAge() {
		return customerAge;
	}


	public void setCustomerAge(String customerAge) {
		this.customerAge = customerAge;
	}


	public String getCustomerMeritalStatus() {
		return customerMeritalStatus;
	}


	public void setCustomerMeritalStatus(String customerMeritalStatus) {
		this.customerMeritalStatus = customerMeritalStatus;
	}

 
	
	
	
	
	
}
