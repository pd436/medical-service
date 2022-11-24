package com.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.constants.ResourceReference;
import com.medical.model.ClinicEmployee;
import com.medical.service.ClinicEmployeeService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Employee Controller" ,description = "Manages employee")
public class ClinicEmployeeController {

	@Autowired 
	ClinicEmployeeService service;
	
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
		List<ClinicEmployee> response = service.getClinicEmployeeDetails();
		return new ResponseWrapper<>(new Metadata(true,"Provides the employee details"),response);
	}
	
	
	
}
