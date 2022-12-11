package com.medical.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SurgerySkill implements Serializable{

	private static final long serialVersionUID = -2135161998034392807L;
	
	
	@Id
	@Column(name = "surgery_skill_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer surgerySkillId;
	
	
	@Column(name="skill_description")
	private String skillDescription;

}
