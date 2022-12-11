package com.medical.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class ClinicRooms {

	private Integer unitNumber;
	private String wing;
	private String bed;
	private Integer patientId;
	private Integer nursingUnitId;
	
	
	public ClinicRooms(Integer unitNumber, String wing, String bed, Integer nursingUnitId) {
		this.bed = bed;
		this.wing = wing;
		this.unitNumber = unitNumber;
		this.nursingUnitId = nursingUnitId;
	}
	
	
	public ClinicRooms(Integer unitNumber, String wing, String bed , Integer patientId, Integer nursingUnitId ) {
		this.bed = bed;
		this.wing = wing;
		this.unitNumber = unitNumber;
		this.patientId = patientId;
		this.nursingUnitId = nursingUnitId;
	}	
	
}
