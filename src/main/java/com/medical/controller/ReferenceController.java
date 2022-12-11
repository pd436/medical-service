package com.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.constants.ResourceReference;
import com.medical.model.NursingUnit;
import com.medical.response.SurgeryTypes;
import com.medical.service.ReferenceService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Reference Controller" ,description = "This resourse provides common references inside the clinic")
public class ReferenceController {
	
	
	@Autowired 
	ReferenceService service;
	
	@Operation(
			summary = "Reference resource for Clinic nursing Unit", description = "This resource provides clinic nursing unit details ",
			  responses = {
			    @ApiResponse(responseCode = "400", description = "Bad Request"),
			    @ApiResponse(responseCode = "404", description = "Not Found"),
			    @ApiResponse(responseCode = "500", description = "Internal Server")
			  }
			)
	@GetMapping( value = ResourceReference.NURSING_UNITS, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseWrapper<List<NursingUnit>> getNursingUnitDetails(){
		List<NursingUnit> response = service.getNursingUnits();
		return new ResponseWrapper<>(new Metadata(true,"Reference for Nursing Unit"),response);
	}
	
	
	
	@Operation(
			summary = "Reference resource for Surgery Types in the clinic", description = "This resource provides surgery Types in the clinic ",
			  responses = {
			    @ApiResponse(responseCode = "400", description = "Bad Request"),
			    @ApiResponse(responseCode = "404", description = "Not Found"),
			    @ApiResponse(responseCode = "500", description = "Internal Server")
			  }
			)
	@GetMapping( value = ResourceReference.SURGERY_TYPES, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseWrapper<List<SurgeryTypes>> getSurgeryTypes(){
		List<SurgeryTypes> response = service.getSurgeryTypes();
		return new ResponseWrapper<>(new Metadata(true,"Reference for Surgery Types"),response);
	}

}
