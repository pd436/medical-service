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
@Table(name = "SURGERY_TYPE_NURSE_QUALIFICATION", schema = "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SurgeryTypeNurseQualification implements Serializable{

	private static final long serialVersionUID = -1115757932428974465L;
	
	@EmbeddedId
	private SurgeryTypeNurseQualificationPk id;

}
