package com.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medical.constants.ResourceReference;
import com.medical.model.SurgerySchedule;
import com.medical.response.SurgeryView;
import com.medical.service.SurgeryService;
import com.medical.util.Constants.AllotmentType;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Surgery Controller", description = "This resourse is used for Surgery Details")
public class SurgeryController {

	@Autowired
	SurgeryService service;

	@Operation(summary = "Resource for Getting Surgery Details", description = "This resource is used to get list of  Surgeries ", responses = {
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal Server") })
	@GetMapping(value = ResourceReference.SUREGERY_DETAILS, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseWrapper<List<SurgerySchedule>> getSurgeries() {
		List<SurgerySchedule> response = service.getSurgeryList();
		return new ResponseWrapper<>(new Metadata(true, "Surgery Details"), response);
	}

	@Operation(summary = "Resource for Getting Surgery Details by Surgeon OverView", description = "This resource is used to get list of Surgeons", responses = {
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal Server") })
	@GetMapping(value = ResourceReference.SURGERY_SURGEON_VIEW, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseWrapper<List<SurgeryView>> getSurgeonOverView() {
		List<SurgeryView> response = service.getSurgeonViewDetails();
		return new ResponseWrapper<>(new Metadata(true, "Surgery Overview details"), response);
	}

	@Operation(summary = "Resource for Getting Surgery Details by Surgeon View", description = "This resource is used to get list of Surgeries performed by Surgeons", responses = {
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal Server") })
	@GetMapping(value = ResourceReference.SURGERIES_BY_EMPLOYEE_ID, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseWrapper<List<SurgeryView>> getSurgeonView(@PathVariable("employeeId") Integer employeeId) {
		List<SurgeryView> response = service.getSurgeryDetailsByClinicEmployee(employeeId);
		return new ResponseWrapper<>(new Metadata(true, "Surgery details by Surgeon id"), response);
	}

	@Operation(summary = "Resource for Getting Surgery Details by Patient View", description = "This resource is used to get list of  Surgeries performed on the Patients ", responses = {
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal Server") })
	@GetMapping(value = ResourceReference.SURGERY_PATIENT_VIEW, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseWrapper<List<SurgeryView>> getPatientOverView() {
		List<SurgeryView> response = service.getPatientViewDetails();
		return new ResponseWrapper<>(new Metadata(true, "Surgery Overview details For Patient"), response);
	}
	
	@Operation(summary = "Resource for Getting Surgery Details by Patient View", description = "This resource is used to get list of Surgeries performed on Patients", responses = {
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal Server") })
	@GetMapping(value = ResourceReference.SURGERIES_BY_PATIENT_VIEW, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseWrapper<List<SurgeryView>> getPatientView(@PathVariable("patientId") Integer patientId) {
		List<SurgeryView> response = service.getSurgeryDetailsByPatientId(patientId);
		return new ResponseWrapper<>(new Metadata(true, "Surgery details by Patient id"), response);
	}
	

	@Operation(summary = "Resource for Booking Surgery", description = "This resource is used to book a surgery for a Patient", responses = {
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "404", description = "Not Found"),
			@ApiResponse(responseCode = "500", description = "Internal Server") })
	@PostMapping(value = ResourceReference.BOOK_SURGERY, produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseWrapper<SurgerySchedule> bookSchedule(@RequestBody SurgerySchedule request,
			@RequestParam(required = true) AllotmentType type) {
		var s = service.bookSurgerySchedule(request);
		return new ResponseWrapper<>(new Metadata(true, "Book a Surgery"), s);
	}

}
