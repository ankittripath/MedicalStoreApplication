package com.medicalstore.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalstore.dto.MedicalStoreDto;
import com.medicalstore.entity.MedicalStore;
import com.medicalstore.exception.MedicalNotFoundException;
import com.medicalstore.repository.MedicalStoreRepository;

@Service
public class MedicalStoreService {
	
	@Autowired
	public MedicalStoreRepository medicalstorerepository;

	public MedicalStore addmedicalstoreinfo(@Valid MedicalStoreDto medicalstoredto) {
		// TODO Auto-generated method stub
		MedicalStore medicalstore = new MedicalStore();
		medicalstore.setMedicalStoreName(medicalstoredto.getMedicalStoreName());
		medicalstore.setMedicalStoreAddress(medicalstoredto.getMedicalStoreAddress());
		 medicalstore.setStatus(medicalstoredto.getStatus());
		medicalstore.setTelephoneNumber(medicalstoredto.getTelephoneNumber());
		return medicalstorerepository.save(medicalstore);
	}

	public MedicalStore updatemedicalstoreinfo(@Valid MedicalStoreDto medicalstoredto, int medicalId) {
		// TODO Auto-generated method stub
		MedicalStore medicalstore = new MedicalStore();
		medicalstore.setMedicalId(medicalstoredto.getMedicalId());
		medicalstore.setMedicalStoreName(medicalstoredto.getMedicalStoreName());
		medicalstore.setMedicalStoreAddress(medicalstoredto.getMedicalStoreAddress());
		 medicalstore.setStatus(medicalstoredto.getStatus());
		medicalstore.setTelephoneNumber(medicalstoredto.getTelephoneNumber());
		return medicalstorerepository.save(medicalstore);
	}

	public List<MedicalStore> getmedicalstorename(String medicalStoreName) throws MedicalNotFoundException {
		// TODO Auto-generated method stub
		if(medicalstorerepository.findByMedicalStoreName(medicalStoreName).isEmpty()) {
			throw new MedicalNotFoundException("Medicalstore not Found");
		}else {
			return medicalstorerepository.findByMedicalStoreName(medicalStoreName);
		}
		
	}

	 
 

	public List<MedicalStore> getmedicalinfocontains(String medicalStoreName) throws MedicalNotFoundException {
		// TODO Auto-generated method stub
		if(medicalstorerepository.findByMedicalStoreNameContains(medicalStoreName).isEmpty()) {
			throw new MedicalNotFoundException(medicalStoreName);
		}else {
		
			return medicalstorerepository.findByMedicalStoreNameContains(medicalStoreName);
		}
		 
	}

	public List<MedicalStore> getmedicalinfoendswith(String medicalStoreName) throws MedicalNotFoundException {
		// TODO Auto-generated method stub
		if(medicalstorerepository.findByMedicalStoreNameEndsWith(medicalStoreName).isEmpty()) {
			throw new MedicalNotFoundException("Medical not found");
		}else {
			return medicalstorerepository.findByMedicalStoreNameEndsWith(medicalStoreName);
		}
		 
	}

	public List<MedicalStore> getmedicalinfostartswith(String medicalStoreName) throws MedicalNotFoundException {
		// TODO Auto-generated method stub
		if(medicalstorerepository.findByMedicalStoreNameStartsWith(medicalStoreName).isEmpty()) {
			throw new MedicalNotFoundException("MedicalStore Not found");			
		}else {
			return medicalstorerepository.findByMedicalStoreNameStartsWith(medicalStoreName);
		}
		 
	}

}
