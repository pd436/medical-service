package com.medical.service.impl;

import com.medical.dto.ClinicEmployeeDTO;
import com.medical.dto.EmployeeShiftDTO;
import com.medical.model.ClinicEmployee;
import com.medical.repository.ClinicEmployeeRepository;
import com.medical.repository.ClinicEmployeeShiftRepository;
import com.medical.service.ClinicEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.medical.mapstruct.mappers.IMedicalMapper.MAPPER;

@Service
public class ClinicEmployeeServiceImpl implements ClinicEmployeeService{
	
	@Autowired
	ClinicEmployeeRepository employeeRepository;

	@Autowired
	ClinicEmployeeShiftRepository clinicEmployeeShiftRepository;



	@Override
	public List<ClinicEmployee> getClinicEmployeeDetails() {
		return employeeRepository.findAll();
	}



	@Override
	public ClinicEmployee addClinicEmployeeDetails(ClinicEmployee clinicEmployee){
		return employeeRepository.save(clinicEmployee);
	};

	@Override
	public ClinicEmployeeDTO getClinicEmployeeDetailsDTOById(int employeeId) {
		ClinicEmployee clinicEmployee = employeeRepository.findById(Long.valueOf(employeeId)).get();

		ClinicEmployeeDTO cesDTO = MAPPER.clinicEmployeeToClinicEmployeeDto(clinicEmployee);

		List<EmployeeShiftDTO> emplShifts = clinicEmployeeShiftRepository.getEmployeeShiftDetails(employeeId);

		cesDTO.setEmployeeShift(emplShifts);

		System.out.println(clinicEmployee);
		return cesDTO;
	}

	@Override
	public ClinicEmployee getClinicEmployeeDetailsById(Long employeeId) {
		return employeeRepository.findById(employeeId).get();
	}


	@Override
	public List<ClinicEmployeeDTO> getClinicEmployeeDetailsByOccupation(int occupationId) {

		List<ClinicEmployeeDTO> clinicEmployee = employeeRepository.getEmployeeDetailsByOccupation(occupationId);

		return clinicEmployee;
	}


	@Override
	public ClinicEmployee removeClinicEmployeeById(Long employeeId) {
		ClinicEmployee clinicEmployee = this.getClinicEmployeeDetailsById(employeeId);
		clinicEmployee.setIsActive(false);
		ClinicEmployee clinicEmployeeDeactivated = this.addClinicEmployeeDetails(clinicEmployee);
		System.out.println(clinicEmployeeDeactivated);
		return clinicEmployeeDeactivated;
	};
	

}
