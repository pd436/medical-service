package com.medical.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PATIENT_ADMISSIONS", schema= "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientAdmissions implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "patient_nursing_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer patientNursingId;
	
	@Column(name = "patient_id")
	private Integer patientId;
	
	@Column(name = "nursing_unit_id")
	private Integer nursingUnitId;


}

