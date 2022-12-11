package com.medical.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="SURGERY_TYPE", schema= "DMSD_MEDICAL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SurgeryType implements Serializable{
	private static final long serialVersionUID = -4739314869027366878L;
	
	@Id
	@Column(name = "surgery_type_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer surgeryTypeId;
	
	
	@Column(name = "special_needs")
	private String specialNeeds;
	
	@Column(name = "surgery_category_id")
	private Integer surgeryCategoryId;
	
	@Column(name = "anatomical_location_id")
	private Integer anatomicalLocationId;

}
