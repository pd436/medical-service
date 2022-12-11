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
public class PatientNursePk implements Serializable{

	private static final long serialVersionUID = -8420497584653619500L;
	
	@Column(name = "patient_id")
	private Integer patientId;

	@Column(name = "nurse_id")
	private Integer nurseId;

	
}
