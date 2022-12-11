package com.medical.service.impl;

import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.javafaker.Faker;
import com.medical.model.ClinicEmployee;
import com.medical.model.Occupation;
import com.medical.model.Patient;
import com.medical.repository.ClinicEmployeeRepository;
import com.medical.repository.ClinicPatientRepository;
import com.medical.service.MockService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MockServiceImpl implements MockService {

	
	
	@Autowired
	ClinicEmployeeRepository employeeRepository;
	
	@Autowired
	ClinicPatientRepository patientRepo;
	
	
	
	@Override
	@Transactional
	public void setEmployeesinClinc(Integer count) {
		try {
			
			Faker usFaker = new Faker(new Locale("en-US"));
			
			
			for(Integer i=0 ; i<=count ; i++) {
				log.info(i.toString());
				ClinicEmployee c1 = new ClinicEmployee();
				c1.setAddress(usFaker.address().fullAddress());
				c1.setEmployeeNumber(String.valueOf(Math.abs(new Random().nextInt())));
				c1.setFirstName(usFaker.name().firstName());
				c1.setLastName(usFaker.name().lastName());
				//c1.setOccupation(new Occupation());
				c1.setClinicId(1);
				//c1.setName(usFaker.name().name());
				c1.setGender("MALE");
				c1.setPhoneNumber(usFaker.phoneNumber().phoneNumber());
				c1.setSsn(usFaker.idNumber().validSvSeSsn());
				c1.setYearsExperience(2);
				log.info(c1.toString());
				employeeRepository.save(c1);
				
			}
			
		}catch (Exception e) {
			log.error("Exception occoured "+e.getMessage());
		}
	}
	
	
	
	@Override
	@Transactional
	public void setPatients(Integer count) {
		try {
			//SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			Faker usFaker = new Faker(new Locale("en-US"));
			
			
			for(Integer i=0 ; i<=count ; i++) {
				log.info(i.toString());
				Patient p1 = new Patient();
				p1.setAddress(usFaker.address().fullAddress());
				p1.setFirstName(usFaker.name().firstName());
				p1.setLastName(usFaker.name().lastName());
				p1.setGender("MALE");
				p1.setDob(usFaker.date().birthday());
				p1.setTelephone(usFaker.phoneNumber().phoneNumber());
				p1.setSsn(usFaker.idNumber().validSvSeSsn());
				log.info(p1.toString());
				patientRepo.save(p1);
				
			}
			
		}catch (Exception e) {
			log.error("Exception occoured "+e.getMessage());
		}
	}

}
