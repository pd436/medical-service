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
@Table(name="ANATOMICAL_LOCATION", schema= "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnatomicalLocation implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "location_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer locationId;
	
	@Column(name = "location")
	private String location;

}
