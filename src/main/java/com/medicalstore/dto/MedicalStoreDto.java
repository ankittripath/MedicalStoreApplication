package com.medicalstore.dto;

 

 
public class MedicalStoreDto {

	
	
	 
	private int medicalId;
	
  
	private String medicalStoreName;
	
	 
	private String medicalStoreAddress;
	
	 
	private String Status;
	
	 
	private String telephoneNumber;


	public MedicalStoreDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MedicalStoreDto(String medicalStoreName, String medicalStoreAddress, String status, String telephoneNumber) {
		super();
		this.medicalStoreName = medicalStoreName;
		this.medicalStoreAddress = medicalStoreAddress;
		Status = status;
		this.telephoneNumber = telephoneNumber;
	}


	public MedicalStoreDto(int medicalId, String medicalStoreName, String medicalStoreAddress, String status,
			String telephoneNumber) {
		super();
		this.medicalId = medicalId;
		this.medicalStoreName = medicalStoreName;
		this.medicalStoreAddress = medicalStoreAddress;
		Status = status;
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
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public String getTelephoneNumber() {
		return telephoneNumber;
	}


	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	
}
