package com.medical.service;

import com.medical.dto.ClinicEmployeeDTO;
import com.medical.model.ClinicEmployee;

import java.util.List;

public interface ClinicEmployeeService {
	
	public List<ClinicEmployee> getClinicEmployeeDetails();

	public ClinicEmployee addClinicEmployeeDetails(ClinicEmployee clinicEmployee);

//	public Optional<ClinicEmployee> getClinicEmployeeDetailsById(Long employeeId);
	public ClinicEmployeeDTO getClinicEmployeeDetailsById(int employeeId);

	public ClinicEmployee removeClinicEmployeeById(Long employeeId);

    List<ClinicEmployeeDTO> getClinicEmployeeDetailsByOccupation(int occupation_id);
}
