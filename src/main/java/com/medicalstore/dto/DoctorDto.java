package com.medicalstore.dto;
 

public class DoctorDto {

	 
	private int doctorId;
	
	 
	private String doctorName;
	
	 
	private String doctorAddress;
	
	 
	private String doctorMobileNumber;


	public DoctorDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DoctorDto(String doctorName, String doctorAddress, String doctorMobileNumber) {
		super();
		this.doctorName = doctorName;
		this.doctorAddress = doctorAddress;
		this.doctorMobileNumber = doctorMobileNumber;
	}


	public DoctorDto(int doctorId, String doctorName, String doctorAddress, String doctorMobileNumber) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAddress = doctorAddress;
		this.doctorMobileNumber = doctorMobileNumber;
	}


	public int getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getDoctorAddress() {
		return doctorAddress;
	}


	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}


	public String getDoctorMobileNumber() {
		return doctorMobileNumber;
	}


	public void setDoctorMobileNumber(String doctorMobileNumber) {
		this.doctorMobileNumber = doctorMobileNumber;
	}

 

	
	
	
}
