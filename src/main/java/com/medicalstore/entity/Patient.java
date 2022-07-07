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
@Table(name="PatientInfo")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	private int patientId;
	
	@Column(name="Patient_Name")
	private String patientName;
	
	@Column(name="Patient_Address")
	private String patientAddress;
	
	@Column(name="Patient_Mobile_Number")
	private String patientMobileNumber;
	
	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	@ManyToOne
	@JoinColumn(name="hospital_hospitalId")
	@JsonManagedReference
	private Hospital hospital;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String patientName, String patientAddress, String patientMobileNumber) {
		super();
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientMobileNumber = patientMobileNumber;
	}

	public Patient(int patientId, String patientName, String patientAddress, String patientMobileNumber) {
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
