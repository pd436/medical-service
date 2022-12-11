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
public class NurseSkillsPk implements Serializable{

	private static final long serialVersionUID = 3124230422258561799L;
	
	
	@Column(name = "nurse_id")
	private Integer nurseId;

	@Column(name = "surgery_skill_id")
	private Integer surgerySkillId;

	
	
}
