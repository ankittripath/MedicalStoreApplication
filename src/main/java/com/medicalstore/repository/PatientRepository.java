package com.medicalstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicalstore.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

	List<Patient> findByPatientName(String patientName);
	
	List<Patient> findByPatientNameContains(String patientName);
	
	List<Patient> findByPatientNameEndsWith(String patientName);
	
	List<Patient> findBypatientNameStartsWith(String patientName);
	
}
