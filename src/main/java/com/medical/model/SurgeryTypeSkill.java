package com.medical.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="SURGERY_TYPE_SKILL", schema= "DMSD_MEDICAL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SurgeryTypeSkill implements Serializable {

	private static final long serialVersionUID = 4749217524826979446L;
	
	@EmbeddedId
	private SurgeryTypeSkillPk id;
	
	

}
