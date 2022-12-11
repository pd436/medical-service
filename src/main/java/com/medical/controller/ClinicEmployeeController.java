package com.medical.controller;

import com.medical.constants.ResourceReference;
import com.medical.dto.ClinicEmployeeDTO;
import com.medical.model.ClinicEmployee;
import com.medical.service.ClinicEmployeeService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Employee Controller" ,description = "Manages employee")
public class ClinicEmployeeController {

	@Autowired 
	ClinicEmployeeService employeeService;
	
	@Operation(
			summary = "resource for employees details", description = "This resource provides clinic-employee details ",
			  responses = {
			    @ApiResponse(responseCode = "400", description = "Bad Request"),
			    @ApiResponse(responseCode = "404", description = "Not Found"),
			    @ApiResponse(responseCode = "500", description = "Internal Server")
			  }
			)
	@GetMapping( value = ResourceReference.CLINIC_EMLPLOYEE_DETAILS, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseWrapper<List<ClinicEmployee>> getEmployeeDetails(){
		List<ClinicEmployee> response = this.employeeService.getClinicEmployeeDetails();
		return new ResponseWrapper<>(new Metadata(true,"Provides the all employee details"),response);
	}


	@GetMapping( value = ResourceReference.CLINIC_EMLPLOYEE_DETAILS_BY_OCCUPATION, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseWrapper<List<ClinicEmployeeDTO>> getEmployeeByOccupation(@PathVariable int occupationId){
		System.out.println(occupationId);
		List<ClinicEmployeeDTO> response = this.employeeService.getClinicEmployeeDetailsByOccupation(occupationId);
		return new ResponseWrapper<>(new Metadata(true,"Provides all patients"),response);
	}

	@PostMapping( value = ResourceReference.CLINIC_EMLPLOYEE_DETAILS, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseWrapper<ClinicEmployee> addEmployeeDetails(@RequestBody ClinicEmployee clinicEmployee){
		System.out.println(clinicEmployee);
		ClinicEmployee response = this.employeeService.addClinicEmployeeDetails(clinicEmployee);
		return new ResponseWrapper<>(new Metadata(true,"Adds the employee details"),response);
	}


	@PostMapping( value = ResourceReference.CLINIC_EMLPLOYEE_REMOVE, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseWrapper<ClinicEmployee> removeEmployee(@PathVariable Long employeeId){
		System.out.println(employeeId);
		ClinicEmployee response = this.employeeService.removeClinicEmployeeById(employeeId);
		return new ResponseWrapper<>(new Metadata(true,"Removes the employee details"),response);
	}


//	@PostMapping( value = ResourceReference.CLINIC_EMLPLOYEE_BY_ID, produces = {MediaType.APPLICATION_JSON_VALUE})
//	public ResponseWrapper<ClinicEmployee> getEmployeeById(@PathVariable Long employeeId){
//		System.out.println(employeeId);
//		Optional<ClinicEmployee> response = this.employeeService.getClinicEmployeeDetailsById(employeeId);
//		return new ResponseWrapper<>(new Metadata(true,"Reads the employee details by id"),response.get());
//	}

	@PostMapping( value = ResourceReference.CLINIC_EMLPLOYEE_BY_ID, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseWrapper<ClinicEmployeeDTO> getEmployeeById(@PathVariable int employeeId){
		System.out.println(employeeId);
		ClinicEmployeeDTO response = this.employeeService.getClinicEmployeeDetailsById(employeeId);
		return new ResponseWrapper<>(new Metadata(true,"Reads the employee details by id"),response);
	}

	
}
