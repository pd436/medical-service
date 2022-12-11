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
@Table(name="SURGERY_CATEGORY", schema= "DMSD_MEDICAL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SurgeryCategory implements Serializable{

	
	private static final long serialVersionUID = -5324977857752446202L;
	
	
	@Id
	@Column(name = "surgery_category_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer surgeryCategoryId;
	
	@Column(name = "description")
	private String description;
}
