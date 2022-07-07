package com.medicalstore.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicalstore.dto.PatientDto;
import com.medicalstore.entity.Patient;
import com.medicalstore.exception.HospitalNotFoundException;
import com.medicalstore.exception.PatientNotFoundException;
import com.medicalstore.repository.PatientRepository;
import com.medicalstore.services.PatientService;

@RestController
public class PatientController {

	@Autowired
	PatientService patientservice;
	
	@Autowired
	PatientRepository patientrepository;
	
	@GetMapping("/patient")
	public List<Patient> showpatient(Patient patient){
		return patientrepository.findAll();
	}
	
	@PostMapping("/addpatient/{hospitalId}")
	public Patient addpatient(@RequestBody @Valid PatientDto patientdto,@PathVariable int hospitalId) throws HospitalNotFoundException {
		return patientservice.addpatient(patientdto,hospitalId);
	}
	
	@PutMapping("/updatepatient/{patientId}")
	public Patient updatepatient(@RequestBody @Valid PatientDto patientdto, @PathVariable int patientId ) {
		return patientservice.updatepatient(patientdto,patientId);
	}
	
	@GetMapping("/getpatientbyname/{patientName}")
	public List<Patient> getpatientbyname(@PathVariable String patientName) throws PatientNotFoundException{
		return patientservice.getpatientbyname(patientName);
	}
	
	@GetMapping("/getpatientnamecontains/{patientName}")
	public List<Patient> getpatientnamecontains(@PathVariable String patientName) throws PatientNotFoundException{
		return patientservice.getpatientnamecontains(patientName);
	}
	
	@GetMapping("/getpatientnameendswith/{patientName}")
	public List<Patient> getpatientnameendswith(@PathVariable String patientName) throws PatientNotFoundException{
		return patientservice.getpatientnameendswith(patientName);
	}
	
	@GetMapping("/getpatientnamestartswith/{patientName}")
	public List<Patient> getpatientnamestartswith(@PathVariable String patientName) throws PatientNotFoundException{
		return patientservice.getpatientnamestartswith(patientName);
	}
}
