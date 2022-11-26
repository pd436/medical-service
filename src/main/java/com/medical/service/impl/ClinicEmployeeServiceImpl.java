package com.medical.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.model.ClinicEmployee;
import com.medical.repository.ClinicEmployeeRepository;
import com.medical.service.ClinicEmployeeService;

@Service
public class ClinicEmployeeServiceImpl implements ClinicEmployeeService{
	
	@Autowired
	ClinicEmployeeRepository employeeRepository;


	@Override
	public List<ClinicEmployee> getClinicEmployeeDetails() {
		return employeeRepository.findAll();
	}

	@Override
	public ClinicEmployee addClinicEmployeeDetails(ClinicEmployee clinicEmployee){
		return employeeRepository.save(clinicEmployee);
	};
	

}
