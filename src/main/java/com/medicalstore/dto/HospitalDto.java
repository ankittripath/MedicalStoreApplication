package com.medicalstore.dto;

public class HospitalDto {

	private int hospitalId;

	private String hospitalName;

	private String hospitalAddress;

	private String hospitalTelephoneNumber;

	private String noOfPatient;

	public HospitalDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HospitalDto(String hospitalName, String hospitalAddress, String hospitalTelephoneNumber,
			String noOfPatient) {
		super();
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
		this.hospitalTelephoneNumber = hospitalTelephoneNumber;
		this.noOfPatient = noOfPatient;
	}

	public HospitalDto(int hospitalId, String hospitalName, String hospitalAddress, String hospitalTelephoneNumber,
			String noOfPatient) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
		this.hospitalTelephoneNumber = hospitalTelephoneNumber;
		this.noOfPatient = noOfPatient;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public String getHospitalTelephoneNumber() {
		return hospitalTelephoneNumber;
	}

	public void setHospitalTelephoneNumber(String hospitalTelephoneNumber) {
		this.hospitalTelephoneNumber = hospitalTelephoneNumber;
	}

	public String getNoOfPatient() {
		return noOfPatient;
	}

	public void setNoOfPatient(String noOfPatient) {
		this.noOfPatient = noOfPatient;
	}
	
	

}
