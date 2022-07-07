package com.medicalstore.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalstore.dto.PatientDto;
import com.medicalstore.entity.Hospital;
import com.medicalstore.entity.Patient;
import com.medicalstore.exception.HospitalNotFoundException;
import com.medicalstore.exception.PatientNotFoundException;
import com.medicalstore.repository.HospitalRepository;
import com.medicalstore.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	PatientRepository patientrepository;
	
	@Autowired
	HospitalRepository hospitalrepository;

	public Patient addpatient(@Valid PatientDto patientdto,int hospitalId) throws HospitalNotFoundException {
		// TODO Auto-generated method stub
		Hospital hospital = hospitalrepository.findById(hospitalId).orElseThrow((()->new HospitalNotFoundException("Hospital is not present")));
		
		Patient patient = new Patient();
		patient.setPatientName(patientdto.getPatientName());
		patient.setPatientAddress(patientdto.getPatientAddress());
		patient.setPatientMobileNumber(patientdto.getPatientMobileNumber());
		patient.setHospital(hospital);
		return patientrepository.save(patient);
	}

	public Patient updatepatient(@Valid PatientDto patientdto, int patientId) {
		// TODO Auto-generated method stub
		Patient patient = new Patient();
		patient.setPatientId(patientdto.getPatientId());
		patient.setPatientName(patientdto.getPatientName());
		patient.setPatientAddress(patientdto.getPatientAddress());
		patient.setPatientMobileNumber(patientdto.getPatientMobileNumber());
		return patientrepository.save(patient);
	}

	public List<Patient> getpatientbyname(String patientName) throws PatientNotFoundException {
		// TODO Auto-generated method stub
		if(patientrepository.findByPatientName(patientName).isEmpty()) {
			throw new PatientNotFoundException("patient is not found");
		}else {
			return patientrepository.findByPatientName(patientName);
		}
		 
	}

	public List<Patient> getpatientnamecontains(String patientName) throws PatientNotFoundException {
		// TODO Auto-generated method stub
		if(patientrepository.findByPatientNameContains(patientName).isEmpty()) {
			throw new PatientNotFoundException("patient is not found");
		}else {
			return patientrepository.findByPatientNameContains(patientName);
		}
		 
	}

	public List<Patient> getpatientnameendswith(String patientName) throws PatientNotFoundException {
		// TODO Auto-generated method stub
		if(patientrepository.findByPatientNameEndsWith(patientName).isEmpty()) {
			throw new PatientNotFoundException("Patient is not found");
		}else {
			return patientrepository.findByPatientNameEndsWith(patientName);
		}
		 
	}

	public List<Patient> getpatientnamestartswith(String patientName) throws PatientNotFoundException {
		// TODO Auto-generated method stub
		if(patientrepository.findBypatientNameStartsWith(patientName).isEmpty()) {
			throw new PatientNotFoundException("Patient is not present");
		}else {
			return patientrepository.findBypatientNameStartsWith(patientName);
		}
		 
	}
	
	

}
