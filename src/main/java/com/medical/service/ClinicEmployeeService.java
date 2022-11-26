package com.medical.service;

import java.util.List;

import com.medical.model.ClinicEmployee;

public interface ClinicEmployeeService {
	
	public List<ClinicEmployee> getClinicEmployeeDetails();

	public ClinicEmployee addClinicEmployeeDetails(ClinicEmployee clinicEmployee);

}
