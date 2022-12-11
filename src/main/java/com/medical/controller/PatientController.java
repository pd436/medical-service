package com.medical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medical.constants.ResourceReference;
import com.medical.service.PatientService;
import com.medical.util.Constants.AllotmentType;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Patient Controller" ,description = "This resourse provides details about the Patient")
public class PatientController {
	
	@Autowired
	PatientService service;
	
	
	@Operation(summary = "Resource for Doctor assignment details", description = "This resource is used to assign /remove Doctor to a patient ", responses = {
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal Server") })
	@PostMapping(value = ResourceReference.PATIENT_BY_DOCTOR, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseWrapper<Boolean> updateDoctor(@PathVariable("patientId") Integer patientId,
			@PathVariable("employeeId") Integer roomId, @RequestParam(required = true) AllotmentType type) {
		service.updateSurgeonForPatient(patientId, roomId, type);;
		return new ResponseWrapper<>(new Metadata(true, "Doctor allocation"), true);
	}

	
	@Operation(summary = "Resource for Nurse assignments details", description = "This resource is used to assign /remove Nurse to a patient ", responses = {
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal Server") })
	@PostMapping(value = ResourceReference.PATIENT_BY_NURSE, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseWrapper<Boolean> updateNurse(@PathVariable("patientId") Integer patientId,
			@PathVariable("employeeId") Integer roomId, @RequestParam(required = true) AllotmentType type) {
		service.updateNurseForPatient(patientId, roomId, type);
		return new ResponseWrapper<>(new Metadata(true, "Nurse allocation"), true);
	}

	

}
