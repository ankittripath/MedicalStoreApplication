package com.medicalstore.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
 

@Entity
@Table(name="medicalstoreinfo")
public class MedicalStore {
	
	@Id
	 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int medicalId;
	
	@Column(name="Medicalstore_Name")
	private String medicalStoreName;
	
	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	@Column(name="Medicalstore_Address")
	private String medicalStoreAddress;
	
	@Column(name="status")
	private String status;
	
	@Column(name="TelePhone_Number")
	private String telephoneNumber;
	
	@OneToMany(mappedBy = "medicalstore",cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Customer> customer;

	public MedicalStore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicalStore(String medicalStoreName, String medicalStoreAddress, String status, String telephoneNumber) {
		super();
		this.medicalStoreName = medicalStoreName;
		this.medicalStoreAddress = medicalStoreAddress;
		this.status = status;
		this.telephoneNumber = telephoneNumber;
	}

	public MedicalStore(int medicalId, String medicalStoreName, String medicalStoreAddress, String status,
			String telephoneNumber) {
		super();
		this.medicalId = medicalId;
		this.medicalStoreName = medicalStoreName;
		this.medicalStoreAddress = medicalStoreAddress;
		this.status = status;
		this.telephoneNumber = telephoneNumber;
	}

	public int getMedicalId() {
		return medicalId;
	}

	public void setMedicalId(int medicalId) {
		this.medicalId = medicalId;
	}

	public String getMedicalStoreName() {
		return medicalStoreName;
	}

	public void setMedicalStoreName(String medicalStoreName) {
		this.medicalStoreName = medicalStoreName;
	}

	public String getMedicalStoreAddress() {
		return medicalStoreAddress;
	}

	public void setMedicalStoreAddress(String medicalStoreAddress) {
		this.medicalStoreAddress = medicalStoreAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;	
	}

	  
	
 


	
 

}
