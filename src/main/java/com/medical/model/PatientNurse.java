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
@Table(name = "PATIENT_NURSE", schema = "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientNurse implements Serializable {

	private static final long serialVersionUID = -5367309311225755830L;
	
	@EmbeddedId
	private PatientNursePk id;

}
