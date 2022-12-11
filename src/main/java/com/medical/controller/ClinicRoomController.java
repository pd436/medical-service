package com.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medical.constants.ResourceReference;
import com.medical.response.ClinicRooms;
import com.medical.service.ClinicRoomService;
import com.medical.util.Constants.AllotmentType;
import com.medical.util.Constants.NursingUnitType;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Clinic Room Controller", description = "This resourse provides clinic Room related details")
public class ClinicRoomController {

	@Autowired
	ClinicRoomService service;

	@Operation(summary = "Resource for Clinic Room details", description = "This resource provides clinic-employee details ", responses = {
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal Server") })
	@GetMapping(value = ResourceReference.CLINIC_ROOMS, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseWrapper<List<ClinicRooms>> getNursingUnitDetails(
			@RequestParam(required = true) NursingUnitType type) {
		List<ClinicRooms> response = service.getClinicRooms(type);
		return new ResponseWrapper<>(new Metadata(true, "Provides Clinic Room details"), response);
	}
	
	
	@Operation(summary = "Resource allocated for a Patient Clinic Room details", description = "This resource provides Room details for a patient ", responses = {
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal Server") })
	@GetMapping(value = ResourceReference.CLINIC_ROOMS_BY_PATIENT_ID, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseWrapper<List<ClinicRooms>> getNursingUnitDetailsByPatientId(@PathVariable("patientId") Integer patientId) {
		List<ClinicRooms> response = service.getClinicRoomsByPatientId(patientId);
		return new ResponseWrapper<>(new Metadata(true, "Provides Clinic Room details"), response);
	}


	@Operation(summary = "Resource for Patient Room allocation details", description = "This resource is used to assign /remove patient ", responses = {
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal Server") })
	@PostMapping(value = ResourceReference.PATIENT_BY_ROOM_ID, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseWrapper<Boolean> updateUnitDetails(@PathVariable("patientId") Integer patientId,
			@PathVariable("roomId") Integer roomId, @RequestParam(required = true) AllotmentType type) {
		service.updateClinicRoomForPatient(patientId, roomId, type);
		return new ResponseWrapper<>(new Metadata(true, "Patient room allocation"), true);
	}

}
