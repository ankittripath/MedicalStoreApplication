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

import com.medicalstore.dto.HospitalDto;
import com.medicalstore.entity.Hospital;
import com.medicalstore.exception.HospitalNotFoundException;
import com.medicalstore.repository.HospitalRepository;
import com.medicalstore.services.HospitalService;

@RestController
 
public class HospitalController {

	@Autowired
	public HospitalService hospitalservice;
	
	@Autowired
	HospitalRepository hospitalrepository;
	
	@GetMapping("/hospital")
	public List<Hospital> showhospital(Hospital hospital) {
		return hospitalrepository.findAll();
	}
	
	
	@PostMapping("/addhospital")
	public Hospital addhospital(@RequestBody @Valid HospitalDto hospitaldto) {
		return hospitalservice.addhospital(hospitaldto);
	}
	
	
	
	@PutMapping("/updatehospital/{hospitalId}")
	public Hospital updatehospital(@RequestBody @Valid HospitalDto hospitaldto,@PathVariable int hospitalId) {
		return hospitalservice.updatehospital(hospitaldto,hospitalId);
	}
	
	
	@GetMapping("/gethospitalname/{hospitalName}")
	public List<Hospital> gethospitalname(@PathVariable String hospitalName) throws HospitalNotFoundException {
		return hospitalservice.gethospitalname(hospitalName);
	}
	
	@GetMapping("/gethospitalnamecontains/{hospitalName}")
	public List<Hospital> gethospitalnamecontains(@PathVariable String hospitalName) throws HospitalNotFoundException{
		return hospitalservice.gethospitalnamecontains(hospitalName);
	}
	
	@GetMapping("/gethospitalnamestartswith/{hospitalName}")
	public List<Hospital> gethospitalnamestartswith(@PathVariable String hospitalName) throws HospitalNotFoundException{
		return hospitalservice.gethospitalnamestartswith(hospitalName);
	}
	
	@GetMapping("/gethospitalnameendswith/{hospitalName}")
	public List<Hospital> gethospitalnameendswith(@PathVariable String hospitalName) throws HospitalNotFoundException{
		return hospitalservice.gethospitalnameendswith(hospitalName);
	}
	
	
		
	
}
