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
@Table(name="hospitalinformation")
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private int hospitalId;
	
	@Column(name="Hospital_Name")
	private String hospitalName;
	
	@Column(name="Hospital_Address")
	private String hospitalAddress;
	
	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	@Column(name="Hospital_Telephone_Number")
	private String hospitalTelephoneNumber;
	
	@Column(name="No_Of_Patient")
	private String noOfPatient;
	
	@OneToMany(mappedBy = "hospital",cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Doctor> doctor;
	
	@OneToMany(mappedBy = "hospital",cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Patient> patient;

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(String hospitalName, String hospitalAddress, String hospitalTelephoneNumber, String noOfPatient) {
		super();
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
		this.hospitalTelephoneNumber = hospitalTelephoneNumber;
		this.noOfPatient = noOfPatient;
	}

	public Hospital(int hospitalId, String hospitalName, String hospitalAddress, String hospitalTelephoneNumber,
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
