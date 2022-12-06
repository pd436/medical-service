package com.medical.model;
import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="occupation", schema= "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Occupation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "occupation_id")
	private Integer occupationId;
	
	@Column(name="occupation")
	private String  occupation;

	@OneToOne(mappedBy = "occupation")
	@JsonIgnore
	@Transient
	private ClinicEmployee clinicEmployee;

}
