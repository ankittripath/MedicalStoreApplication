package com.medicalstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicalstore.entity.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

	List<Hospital> findByHospitalName(String hospitalName);
	
	List<Hospital> findByHospitalNameContains(String hospitalName);
	
	List<Hospital> findByHospitalNameStartsWith(String hospitalName);
	
	List<Hospital> findByHospitalNameEndsWith(String hospitalName);
	
}
