package com.medicalstore.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalstore.dto.DoctorDto;
import com.medicalstore.entity.Doctor;
import com.medicalstore.entity.Hospital;
import com.medicalstore.exception.DoctorNotFoundException;
import com.medicalstore.exception.HospitalNotFoundException;
import com.medicalstore.repository.DoctorRepository;
import com.medicalstore.repository.HospitalRepository;

@Service
public class DoctorService {
	
	@Autowired
	DoctorRepository doctorrepository;
	
	@Autowired
	HospitalRepository hospitalrepository;

	public Doctor adddoctor(@Valid DoctorDto doctordto,int hospitalId) throws HospitalNotFoundException {
		// TODO Auto-generated method stub
		Hospital hospital = hospitalrepository.findById(hospitalId).orElseThrow((()->new HospitalNotFoundException("Hospital is not present")));
		
		Doctor doctor = new Doctor();
		doctor.setDoctorName(doctordto.getDoctorName());
		doctor.setDoctorAddress(doctordto.getDoctorAddress());
		doctor.setDoctorMobileNumber(doctordto.getDoctorMobileNumber());
		doctor.setHospital(hospital);
		
		return doctorrepository.save(doctor);
	}

	public Doctor updatedoctor(@Valid DoctorDto doctordto, int doctorId) {
		// TODO Auto-generated method stub
		
		Doctor doctor = new Doctor();
		
		 doctor.setDoctorId(doctordto.getDoctorId());
		doctor.setDoctorName(doctordto.getDoctorName());
		doctor.setDoctorAddress(doctordto.getDoctorAddress());
		doctor.setDoctorMobileNumber(doctordto.getDoctorMobileNumber());
		return doctorrepository.save(doctor);
	}

	public List<Doctor> getbydoctorname(String doctorName) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		if(doctorrepository.findByDoctorName(doctorName).isEmpty()) {
			throw new DoctorNotFoundException("Doctor is not found");
		}else {
			return doctorrepository.findByDoctorName(doctorName);
		}
		 
	}

	public List<Doctor> getbydoctornamecontains(String doctorName) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		if(doctorrepository.findByDoctorNameContains(doctorName).isEmpty()) {
			throw new DoctorNotFoundException("Doctor is not present");
		}else {
			return doctorrepository.findByDoctorNameContains(doctorName);
		}
		 
	}

	public List<Doctor> getbydoctornameendswith(String doctorName) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		if(doctorrepository.findByDoctorNameEndsWith(doctorName).isEmpty()) {
			throw new DoctorNotFoundException("Doctor is not present");
		}else {
			return doctorrepository.findByDoctorNameEndsWith(doctorName);
		}
		 
	}

	public List<Doctor> getbydoctornamestartswith(String doctorName) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		if(doctorrepository.findByDoctorNameStartsWith(doctorName).isEmpty()) {
			throw new DoctorNotFoundException("Doctor is not present");
		}else {
			return doctorrepository.findByDoctorNameStartsWith(doctorName);
		}
		 
	}
 

}
