package com.medicalstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicalstore.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	List<Doctor> findByDoctorName(String doctorName);
	
	List<Doctor> findByDoctorNameContains(String doctorName);
	
	List<Doctor> findByDoctorNameEndsWith(String doctorName);
	
	List<Doctor> findByDoctorNameStartsWith(String doctorName);
}
