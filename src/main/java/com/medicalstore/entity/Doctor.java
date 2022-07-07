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
@Table(name="DoctorInfo")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private int doctorId;
	
	@Column(name="Doctor_Name")
	private String doctorName;
	
	@Column(name="Doctor_Address")
	private String doctorAddress;
	
	@Column(name="Doctor_Mobile_Number")
	private String doctorMobileNumber;
	
	@ManyToOne
	@JoinColumn(name="hospital_hospitalId")
	@JsonManagedReference
	private Hospital hospital;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String doctorName, String doctorAddress, String doctorMobileNumber) {
		super();
		this.doctorName = doctorName;
		this.doctorAddress = doctorAddress;
		this.doctorMobileNumber = doctorMobileNumber;
	}

	public Doctor(int doctorId, String doctorName, String doctorAddress, String doctorMobileNumber) {
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

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	 

}
