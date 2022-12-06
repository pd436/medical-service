package com.medical.service.impl;

import java.util.List;
import java.util.Optional;
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

	@Override
	public Optional<ClinicEmployee> getClinicEmployeeDetailsById(Long employeeId) {
		Optional<ClinicEmployee> c = employeeRepository.findById(employeeId);
		System.out.println(c);
		return c;
	};

	@Override
	public ClinicEmployee removeClinicEmployeeById(Long employeeId) {
		Optional<ClinicEmployee> clinicEmployee = getClinicEmployeeDetailsById(employeeId);
		clinicEmployee.get().setIsActive(false);
		ClinicEmployee clinicEmployeeDeactivated = this.addClinicEmployeeDetails(clinicEmployee.get());
		System.out.println(clinicEmployeeDeactivated);
		return clinicEmployeeDeactivated;
	};
	

}
