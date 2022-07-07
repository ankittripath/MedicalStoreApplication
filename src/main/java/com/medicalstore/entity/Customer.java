package com.medicalstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
 

@Entity
@Table(name="CustomerInfo")
public class Customer {
	
	
	 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	 
	private int customerId;
	
	@Column(name="Customer_Name")
	private String customerName;
	
	@Column(name="Customer_Address")
	private String customerAddress;
	
	@Column(name="Customer_Mobile_Number")
	private String customerMobileNumber;
	
	@Column(name="Customer_Age")
	private String customerAge;
	
	@Column(name="Customer_Merital_Status")
	private String customerMeritalStatus;
	
	@ManyToOne
	@JoinColumn(name="medicalstore_medicalId")
	@JsonManagedReference
	private MedicalStore medicalstore;
	

	public MedicalStore getMedicalstore() {
		return medicalstore;
	}

	public void setMedicalstore(MedicalStore medicalstore) {
		this.medicalstore = medicalstore;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, String customerAddress, String customerMobileNumber, String customerAge,
			String customerMeritalStatus) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerMobileNumber = customerMobileNumber;
		this.customerAge = customerAge;
		this.customerMeritalStatus = customerMeritalStatus;
	}

	public Customer(int customerId, String customerName, String customerAddress, String customerMobileNumber,
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
