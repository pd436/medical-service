package com.medical.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SurgeryTypeNurseQualificationPk implements Serializable{

	private static final long serialVersionUID = -1612197095384892763L;
	
	@Column(name = "surgery_type_id")
	private Integer surgeryTypeId;

	@Column(name = "surgery_skill_id")
	private Integer surgerySkillId;
	
	

}
