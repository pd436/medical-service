package com.medical.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Consultation", schema= "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Consultation implements Serializable{
	
	private static final long serialVersionUID = 658444822189844326L;
	
	@Id
	@Column(name = "consultation_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer consuldationId;
	
	@Column(name = "patient_id")
	private Integer patientId;
	
	@Column(name = "consultation_time")
	@JsonFormat(pattern = "MM/dd/yyyy hh:mm:ss")
	private LocalDateTime consultationTime;
	
	
	@Column(name = "physician_id")
	private Integer physicianId;

}
