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

import com.medicalstore.dto.MedicalStoreDto;
import com.medicalstore.entity.MedicalStore;
import com.medicalstore.exception.MedicalNotFoundException;
import com.medicalstore.repository.MedicalStoreRepository;
import com.medicalstore.services.MedicalStoreService;

@RestController
public class MedicalStoreController {
	
	@Autowired
	public MedicalStoreService medicalstoreservice;
	
	@Autowired
	MedicalStoreRepository medicalstorerepository;
	
	@GetMapping("/medicalstore")
	public List<MedicalStore> showmedicalstore(MedicalStore medicalstore){
		return medicalstorerepository.findAll();
	}

	@PostMapping("/addmedicalstore")
	public MedicalStore addmedicalstore(@RequestBody @Valid MedicalStoreDto medicalstoredto) {
		return medicalstoreservice.addmedicalstoreinfo(medicalstoredto);
	}
	
	
	@PutMapping("/updatemedicalstore/{medicalId}")
	public MedicalStore updatemedicalstore(@RequestBody @Valid MedicalStoreDto medicalstoredto,int medicalId ) {
		return medicalstoreservice.updatemedicalstoreinfo(medicalstoredto,medicalId);
	}
	
	 
	@GetMapping("/getmedicalstorename/{medicalStoreName}")
	public List<MedicalStore> getmedicalstorename(@PathVariable String medicalStoreName) throws MedicalNotFoundException{
		return medicalstoreservice.getmedicalstorename(medicalStoreName);
	}
	
	@GetMapping("/getmedicalcontains/{medicalStoreName}")
	public List<MedicalStore> medicalinfocontains(@PathVariable String medicalStoreName) throws MedicalNotFoundException{
		return medicalstoreservice.getmedicalinfocontains(medicalStoreName);
	}
	
	@GetMapping("/getmedicalendswith/{medicalStoreName}")
	public List<MedicalStore> medicalinfoendswith(@PathVariable String medicalStoreName) throws MedicalNotFoundException{
		return medicalstoreservice.getmedicalinfoendswith(medicalStoreName);
	}
	
	
	@GetMapping("/getmedicalstartswith/{medicalStoreName}")
	public List<MedicalStore> medicalinfostartswith(@PathVariable String medicalStoreName) throws MedicalNotFoundException{
		return medicalstoreservice.getmedicalinfostartswith(medicalStoreName);
	}
}
