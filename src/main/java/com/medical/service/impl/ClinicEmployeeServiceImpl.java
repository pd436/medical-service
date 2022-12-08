package com.medical.service.impl;

import java.util.List;

import com.medical.dto.ClinicEmployeeShiftDTO;
import com.medical.dto.EmployeeOccupationDTO;
import com.medical.dto.EmployeeShiftDTO;
import com.medical.mapstruct.mappers.impl.MedicalMapper;
import com.medical.repository.ClinicEmployeeShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.model.ClinicEmployee;
import com.medical.repository.ClinicEmployeeRepository;
import com.medical.service.ClinicEmployeeService;

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
	public ClinicEmployeeShiftDTO getClinicEmployeeDetailsById(int employeeId) {
		ClinicEmployee clinicEmployee = employeeRepository.findById(Long.valueOf(employeeId)).get();

		ClinicEmployeeShiftDTO cesDTO = MAPPER.clinicEmployeeToClinicEmployeeDto(clinicEmployee);

		List<EmployeeShiftDTO> emplShifts = clinicEmployeeShiftRepository.getEmployeeShiftDetails(employeeId);

		cesDTO.setEmployeeShift(emplShifts);

		System.out.println(clinicEmployee);
		return cesDTO;
	};

//	@Override
//	public ClinicEmployeeShiftDTO getClinicEmployeeDetailsById(Long employeeId) {
//		return employeeRepository.getEmployeeById(employeeId);
//	}

	@Override
	public ClinicEmployee removeClinicEmployeeById(Long employeeId) {
		return null;
	}

	;

//	@Override
//	public ClinicEmployee removeClinicEmployeeById(Long employeeId) {
//		Optional<ClinicEmployee> clinicEmployee = getClinicEmployeeDetailsById(employeeId);
//		clinicEmployee.get().setIsActive(false);
//		ClinicEmployee clinicEmployeeDeactivated = this.addClinicEmployeeDetails(clinicEmployee.get());
//		System.out.println(clinicEmployeeDeactivated);
//		return clinicEmployeeDeactivated;
//	};
	

}
