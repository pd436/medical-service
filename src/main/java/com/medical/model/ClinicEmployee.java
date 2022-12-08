package com.medical.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.Type;


@Entity
@Table(name="clinic_employee", schema= "DMSD_MEDICAL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClinicEmployee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "clinic_employee_id")
	private Long clinicEmployeeId;

	@Column(name = "clinic_id")
	private Integer clinicId;
	
	@Column(name = "employee_number")
	private String employeeNumber;
	
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

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "occupation", referencedColumnName = "occupation_id")
	private Occupation occupation;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "contract", referencedColumnName = "contract_type_id")
	private SurgeonContract contract;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "grade", referencedColumnName = "grade_id")
	private NurseGrade nurseGrade;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "specialty", referencedColumnName = "specialty_id")
	private EmployeeSpecialty specialty;

//	@OneToMany(mappedBy = "clinicEmployee")
//	@JsonManagedReference
//	List<EmployeeShift> shifts;



}
