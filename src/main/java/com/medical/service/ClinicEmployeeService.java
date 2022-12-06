package com.medical.service;

import java.util.List;
import java.util.Optional;

import com.medical.model.ClinicEmployee;
import com.medical.model.EmployeeShiftType;

public interface ClinicEmployeeService {
	
	public List<ClinicEmployee> getClinicEmployeeDetails();

	public ClinicEmployee addClinicEmployeeDetails(ClinicEmployee clinicEmployee);

	public Optional<ClinicEmployee> getClinicEmployeeDetailsById(Long employeeId);

	public ClinicEmployee removeClinicEmployeeById(Long employeeId);

}
