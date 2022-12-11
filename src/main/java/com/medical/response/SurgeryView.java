package com.medical.response;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class SurgeryView {

	private Integer clinicEmployeeId;
	private Integer employeeNumber;
	private String surgeonName;
	private String speciality;
	private String phonenumber;

	private Integer patientId;
	private String patientName;
	private String contactNumber;
	
	
	
	private LocalDateTime surgeryDate;
	private String specialNeeds;
	private String category;
	private String location;
	private Integer unitNumber;
	private String wing;
	private String bed;
	
	
	private String yearsExperience;
	
	/*
	 * 
	 * Surgeon Overview
	 * 
	 * 
	 */

	public SurgeryView(Integer clinicEmployeeId, Integer employeeNumber, String name, String speciality,
			String phonenumber) {
		this.clinicEmployeeId = clinicEmployeeId;
		this.employeeNumber = employeeNumber;
		this.surgeonName = name;
		this.speciality = speciality;
		this.phonenumber = phonenumber;
	}

	/*
	 * Patient Overview
	 * 
	 */
	public SurgeryView(Integer patientId, String name, String contactNumber) {
		this.patientId = patientId;
		this.patientName = name;
		this.contactNumber = contactNumber;

	}
	/*
	 *  Surgeon View by id
	 * 
	 */
	
	public SurgeryView(String patientName,LocalDateTime surgeryDate,String specialNeeds,
			String category,String location,Integer unitNumber,String wing,String bed) {
		this.patientName = patientName;
		this.surgeryDate= surgeryDate;
		this.specialNeeds = specialNeeds;
		this.category = category;
		this.location =  location;
		this.unitNumber = unitNumber;
		this.wing =  wing;
		this.bed  = bed;
	}
	/*
	 * Patient View by id
	 * 
	 */
	public SurgeryView(String surgeonName,String phonenumber,String yearsExperience, 
			LocalDateTime surgeryDate,String specialNeeds,
			String category,String location,Integer unitNumber,String wing,String bed) {
		this.surgeonName = surgeonName;
		this.phonenumber = phonenumber;
		this.yearsExperience = yearsExperience;
		this.surgeryDate= surgeryDate;
		this.specialNeeds = specialNeeds;
		this.category = category;
		this.location =  location;
		this.unitNumber = unitNumber;
		this.wing =  wing;
		this.bed  = bed;
	}

}
