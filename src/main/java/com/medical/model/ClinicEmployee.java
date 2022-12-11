package com.medical.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="CLINIC_EMPLOYEE", schema= "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClinicEmployee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "clinic_employee_id")
	private Integer clinicemployeeId;
	
	@Column(name = "clinic_id")
	private Integer clinicId;
	
	@Column(name = "employee_number")
	private Integer employeeNumber;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "occupation_id")
	private Integer occupationID;
	
	@Column(name = "speciality")
	private String speciality;
	
	@Column(name = "salary")
	private Long salary;
	
	@Column(name = "ssn")
	private String ssn;
	
	@Column(name = "grade")
	private String grade;
	
	@Column(name = "years_experience")
	private Integer yearsExperience;
	
	@Column(name = "is_owner")
	@Type(type= "yes_no")
	private Boolean isOwner;
	
	
	@Column(name = "is_active")
	@Type(type= "yes_no")
	private Boolean isActive;
	
	@Column(name = "shift_id")
	private Integer shift;
	
	@Column(name = "max_allocated_patient")
	private Integer maxAllocatedPatient;
	
	@Column(name = "min_allocated_patient")
	private Integer minAllocatedPatient;
	

}
