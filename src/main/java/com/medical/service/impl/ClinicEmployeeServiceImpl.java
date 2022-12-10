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
	public ClinicEmployeeDTO getClinicEmployeeDetailsById(int employeeId) {
		ClinicEmployee clinicEmployee = employeeRepository.findById(Long.valueOf(employeeId)).get();

		ClinicEmployeeDTO cesDTO = MAPPER.clinicEmployeeToClinicEmployeeDto(clinicEmployee);

		List<EmployeeShiftDTO> emplShifts = clinicEmployeeShiftRepository.getEmployeeShiftDetails(employeeId);

		cesDTO.setEmployeeShift(emplShifts);

		System.out.println(clinicEmployee);
		return cesDTO;
	}



//	@Override
//	public ClinicEmployeeShiftDTO getClinicEmployeeDetailsById(Long employeeId) {
//		return employeeRepository.getEmployeeById(employeeId);
//	}

	@Override
	public ClinicEmployee removeClinicEmployeeById(Long employeeId) {
		return null;
	}

	@Override
	public List<ClinicEmployeeDTO> getClinicEmployeeDetailsByOccupation(int occupationId) {

		List<ClinicEmployeeDTO> clinicEmployee = employeeRepository.getEmployeeDetailsByOccupation(occupationId);


		return clinicEmployee;
	}


//	@Override
//	public ClinicEmployee removeClinicEmployeeById(Long employeeId) {
//		Optional<ClinicEmployee> clinicEmployee = getClinicEmployeeDetailsById(employeeId);
//		clinicEmployee.get().setIsActive(false);
//		ClinicEmployee clinicEmployeeDeactivated = this.addClinicEmployeeDetails(clinicEmployee.get());
//		System.out.println(clinicEmployeeDeactivated);
//		return clinicEmployeeDeactivated;
//	};
	

}
