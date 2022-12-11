package com.medical.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="NURSING_UNIT", schema= "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NursingUnit implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nursing_unit_id")
	private Integer nursingUnitId;
	
	@Column(name = "unit_number_id")
	private Integer unitNumber;
	
	@Column(name = "wing")
	private String wing;
	
	@Column(name = "bed")
	private String bed;
	
}
