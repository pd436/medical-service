package com.medical.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
@AllArgsConstructor
public class SurgeryTypes {
	
	private Integer surgeryTypeId;
	private String specialNeeds;
	private String location;
	private String description;
	private Integer surgerySkillId;
	private String skillDescription;
}
