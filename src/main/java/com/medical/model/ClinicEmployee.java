package com.medical.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="clinic_employee", schema= "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClinicEmployee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "clinic_employee_id")
	private Integer clinicId;
	
	@Column(name = "employee_number")
	private Integer employeeNumber;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
//	@Column(name = "occupation_id")
//	private Integer occupationId;

//	@Column(name = "contract_type_id")
//	private Integer contractTypeId;
	
//	@Column(name = "speciality")
//	private String speciality;

	@Column(name = "salary")
	private Long salary;
	
	@Column(name = "ssn")
	private String ssn;

	@Column(name = "dob")
	@JsonFormat(pattern="MM/dd/yyyy")
	private Date dob;
	
//	@Column(name = "nurse_grade_id")
//	private String nurseGradeId;
	
	@Column(name = "years_experience")
	private Integer yearsExperience;
	
	@Column(name = "is_owner")
	@Type(type= "yes_no")
	private Boolean isOwner;
	
	@Column(name = "is_active")
	@Type(type= "yes_no")
	private Boolean isActive;
	
	@Column(name = "shift_id")
	private Integer shiftId;
	
	@Column(name = "max_allocated_patient")
	private Integer maxAllocatedPatient;
	
	@Column(name = "min_allocated_patient")
	private Integer minAllocatedPatient;

	@OneToOne
	@JoinColumn(name = "occupation_id", referencedColumnName = "occupation_id")
	private Occupation occupation;

	@OneToOne
	@JoinColumn(name = "contract_type_id", referencedColumnName = "contract_type_id")
	private SurgeonContract contract;

	@OneToOne
	@JoinColumn(name = "nurse_grade_id", referencedColumnName = "grade_id")
	private NurseGrade nurseGrade;

	@OneToOne
	@JoinColumn(name = "specialty_id", referencedColumnName = "specialty_id")
	private EmployeeSpecialty specialty;


}
