package com.medicalstore.dto;
 

public class PatientDto {

	 
	private int patientId;
	
	 
	private String patientName;
	
	 
	private String patientAddress;
	
	 
	private String patientMobileNumber;


	public PatientDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PatientDto(String patientName, String patientAddress, String patientMobileNumber) {
		super();
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientMobileNumber = patientMobileNumber;
	}


	public PatientDto(int patientId, String patientName, String patientAddress, String patientMobileNumber) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientMobileNumber = patientMobileNumber;
	}


	public int getPatientId() {
		return patientId;
	}


	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public String getPatientAddress() {
		return patientAddress;
	}


	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}


	public String getPatientMobileNumber() {
		return patientMobileNumber;
	}


	public void setPatientMobileNumber(String patientMobileNumber) {
		this.patientMobileNumber = patientMobileNumber;
	}
	
	

}
