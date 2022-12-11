package com.medical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medical.constants.ResourceReference;
import com.medical.service.MockService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Mock Controller to Generate" ,description = "This resourse provides end-point to create Mock data")
public class MockController {
	
	
	@Autowired 
	MockService service;
	
	@Operation(
			summary = "Resource for setting mock employee details", description = "This resource is to add employees to a clinic ",
			  responses = {
			    @ApiResponse(responseCode = "400", description = "Bad Request"),
			    @ApiResponse(responseCode = "404", description = "Not Found"),
			    @ApiResponse(responseCode = "500", description = "Internal Server")
			  }
			)
	@GetMapping( value = ResourceReference.MOCK_EMPLOYEE, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseWrapper<Boolean> setEmployeeDetails(@RequestParam(required = true) Integer count){
		service.setEmployeesinClinc(count);
		return new ResponseWrapper<>(new Metadata(true,"Saves employee details"),true);
	}
	
	
	@Operation(
			summary = "Resource for setting mock employee details", description = "This resource is to add employees to a clinic ",
			  responses = {
			    @ApiResponse(responseCode = "400", description = "Bad Request"),
			    @ApiResponse(responseCode = "404", description = "Not Found"),
			    @ApiResponse(responseCode = "500", description = "Internal Server")
			  }
			)
	@GetMapping( value = ResourceReference.MOCK_PATIENTS, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseWrapper<Boolean> setPatientDetails(@RequestParam(required = true) Integer count){
		service.setPatients(count);
		return new ResponseWrapper<>(new Metadata(true,"Saves the patient details"),true);
	}
	
}
