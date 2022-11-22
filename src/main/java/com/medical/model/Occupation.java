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
@Table(name="OCCUPATION", schema= "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Occupation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "OCCUPATION_ID")
	private Integer occupationId;
	
	@Column(name="OCCUPATION")
	private String  occupation;

}
