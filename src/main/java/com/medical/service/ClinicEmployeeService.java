package com.medical.service;

import java.util.List;

import com.medical.dto.ClinicEmployeeShiftDTO;
import com.medical.model.ClinicEmployee;

public interface ClinicEmployeeService {
	
	public List<ClinicEmployee> getClinicEmployeeDetails();

	public ClinicEmployee addClinicEmployeeDetails(ClinicEmployee clinicEmployee);

//	public Optional<ClinicEmployee> getClinicEmployeeDetailsById(Long employeeId);
	public ClinicEmployeeShiftDTO getClinicEmployeeDetailsById(int employeeId);

	public ClinicEmployee removeClinicEmployeeById(Long employeeId);

}
