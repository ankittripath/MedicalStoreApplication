package com.medicalstore.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicalstore.dto.HospitalDto;
import com.medicalstore.entity.Hospital;
import com.medicalstore.exception.HospitalNotFoundException;
import com.medicalstore.repository.HospitalRepository;

@Service
public class HospitalService {
	
	@Autowired
	HospitalRepository hospitalrepository;

	public Hospital addhospital(HospitalDto hospitaldto) {
		// TODO Auto-generated method stub
		 
		Hospital hospital = new Hospital();
		 
		hospital.setHospitalName(hospitaldto.getHospitalName());
		hospital.setHospitalAddress(hospitaldto.getHospitalAddress());
		hospital.setHospitalTelephoneNumber(hospitaldto.getHospitalTelephoneNumber());
		hospital.setNoOfPatient(hospitaldto.getNoOfPatient());
		return hospitalrepository.save(hospital);
	}

	public Hospital updatehospital(@Valid HospitalDto hospitaldto, int hospitalId) {
		// TODO Auto-generated method stub
		Hospital hospital = new Hospital();
		hospital.setHospitalId(hospitaldto.getHospitalId());
		hospital.setHospitalName(hospitaldto.getHospitalName());
		hospital.setHospitalAddress(hospitaldto.getHospitalAddress());
		hospital.setHospitalTelephoneNumber(hospitaldto.getHospitalTelephoneNumber());
		hospital.setNoOfPatient(hospitaldto.getNoOfPatient());
		
		return hospitalrepository.save(hospital);
	}

	public List<Hospital> gethospitalname(String hospitalName) throws HospitalNotFoundException {
		// TODO Auto-generated method stub
		if(hospitalrepository.findByHospitalName(hospitalName).isEmpty()) {
			throw new HospitalNotFoundException("Hospital Name not found");
		}else {
			return hospitalrepository.findByHospitalName(hospitalName);
		}
		 
	}

	public List<Hospital> gethospitalnamecontains(String hospitalName) throws HospitalNotFoundException {
		// TODO Auto-generated method stub
		if(hospitalrepository.findByHospitalNameContains(hospitalName).isEmpty()) {
			throw new HospitalNotFoundException("Hospital Name not contains");
		}else {
			return hospitalrepository.findByHospitalNameContains(hospitalName);
		}
		 
	}

	public List<Hospital> gethospitalnamestartswith(String hospitalName) throws HospitalNotFoundException {
		// TODO Auto-generated method stub
		if(hospitalrepository.findByHospitalNameStartsWith(hospitalName).isEmpty()) {
			throw new HospitalNotFoundException("Hospital is not present");
		}else {
			return hospitalrepository.findByHospitalNameStartsWith(hospitalName);
		}
		
		 
	}

	public List<Hospital> gethospitalnameendswith(String hospitalName) throws HospitalNotFoundException {
		// TODO Auto-generated method stub
		if(hospitalrepository.findByHospitalNameEndsWith(hospitalName).isEmpty()) {
			throw new HospitalNotFoundException("Hospital is not present");
		}else {
			return hospitalrepository.findByHospitalNameEndsWith(hospitalName);
		}
		 
	}
	
	
	

	
}
