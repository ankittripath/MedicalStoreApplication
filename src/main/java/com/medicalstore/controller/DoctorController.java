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

import com.medicalstore.dto.DoctorDto;
import com.medicalstore.entity.Doctor;
import com.medicalstore.exception.DoctorNotFoundException;
import com.medicalstore.exception.HospitalNotFoundException;
import com.medicalstore.repository.DoctorRepository;
import com.medicalstore.services.DoctorService;

@RestController
public class DoctorController  {

	
	@Autowired
	DoctorService doctorservice;
	
	@Autowired
	DoctorRepository doctorrepository;
	
	@GetMapping("/doctor")
	public List<Doctor> showdoctor(Doctor docter){
		return doctorrepository.findAll();
	}
	
	
	@PostMapping("/adddoctor/{hospitalId}")
	public Doctor adddoctor(@RequestBody @Valid DoctorDto doctordto,@PathVariable int hospitalId) throws HospitalNotFoundException {
		return doctorservice.adddoctor(doctordto,hospitalId);
	}
	
	@PutMapping("/updatedoctor/{doctorId}")
	public Doctor updatedoctor(@RequestBody @Valid DoctorDto doctordto,@PathVariable int doctorId) {
		return doctorservice.updatedoctor(doctordto,doctorId);
	}
	
	@GetMapping("/getbydoctorname/{doctorName}")
	public List<Doctor> getbydoctorname(@PathVariable String doctorName) throws DoctorNotFoundException{
		return doctorservice.getbydoctorname(doctorName);
	}
	
	
	@GetMapping("/getbydoctornamecontains/{doctorName}")
	public List<Doctor> getbydoctornamecontains(@PathVariable String doctorName) throws DoctorNotFoundException{
		return doctorservice.getbydoctornamecontains(doctorName);
	}
	
	@GetMapping("/getbydoctornameendswith/{doctorName}")
	public List<Doctor> getbydoctornameendswith(@PathVariable String doctorName) throws DoctorNotFoundException{
		return doctorservice.getbydoctornameendswith(doctorName);
	}
	
	@GetMapping("/getbydoctornamestartswith/{doctorName}")
	public List<Doctor> getbydoctornamestartswith(@PathVariable String doctorName) throws DoctorNotFoundException{
		return doctorservice.getbydoctornamestartswith(doctorName);
	}
}
