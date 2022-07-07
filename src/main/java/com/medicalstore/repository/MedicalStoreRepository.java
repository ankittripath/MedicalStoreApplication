package com.medicalstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicalstore.entity.MedicalStore;


@Repository
public interface MedicalStoreRepository extends JpaRepository<MedicalStore, Integer> {

	
	List<MedicalStore> findByMedicalStoreName(String medicalStoreName);
	
	 List<MedicalStore> findByMedicalStoreNameContains(String medicalStoreName);
	 
	 List<MedicalStore> findByMedicalStoreNameEndsWith(String medicalStoreName);
	 
	 List<MedicalStore> findByMedicalStoreNameStartsWith(String medicalStoreName);
}
