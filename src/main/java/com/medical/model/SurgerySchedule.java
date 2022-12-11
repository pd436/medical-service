package com.medical.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="SURGERY_SCHEDULE", schema= "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SurgerySchedule implements Serializable{
	
	
	private static final long serialVersionUID = -8663141826206535591L;


	@Id
	@Column(name = "surgery_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer surgeryId;
	
	
	@Column(name = "surgery_type_id")
	private Integer surgeryTypeId;
	
	@Column(name = "physician_id")
	private Integer physicianId;
	
	@Column(name = "patient_id")
	private Integer patientId;
	
	@Column(name = "surgery_date")
	//@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDateTime surgeryDate;

}