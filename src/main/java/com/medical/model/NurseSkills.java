package com.medical.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "NURSE_SKILLS", schema = "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NurseSkills implements Serializable{

	private static final long serialVersionUID = -8204057656277009801L;
	
	@EmbeddedId
	private NurseSkillsPk id;
	
	

}
