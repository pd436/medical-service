package com.medical.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClinicEmployeeDTO {

    private Integer clinicId;
    private Long clinicEmployeeId;
    private String employeeNumber;
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String phoneNumber;
    private Long salary;
    private String ssn;
    private Date dob;
    private Integer yearsExperience;
    private Boolean isOwner;
    private Boolean isActive;
    private Integer maxAllocatedPatient;
    private Integer minAllocatedPatient;

    private Integer occupationId;

    private List<EmployeeShiftDTO> employeeShift;

    private EmployeeOccupationDTO occupation;

    private EmployeeContractDTO contract;

    private EmployeeNurseGradeDTO nurseGrade;

    private EmployeeSpecialtyDTO specialty;

    public ClinicEmployeeDTO(String firstName, String lastName, Integer occupationId,Long clinicEmployereId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clinicEmployeeId = clinicEmployereId;
        this.occupationId = occupationId;
    }

    public ClinicEmployeeDTO(Integer clinicId, Long clinicEmployeeId, String firstName, String lastName, String gender,
                             String address, String phoneNumber, Long salary, String ssn,
                             Date dob, Integer yearsExperience, Boolean isOwner, Boolean isActive,
                             Integer shiftId, Integer maxAllocatedPatient, Integer minAllocatedPatient,
                             String employeeNumber, int shiftTypeId, Date shiftDate, String shiftDesc, String shiftType){
        this.clinicId = clinicId;
        this.clinicEmployeeId = clinicEmployeeId;
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.ssn = ssn;
        this.dob = dob;
        this.yearsExperience = yearsExperience;
        this.isOwner = isOwner;
        this.isActive = isActive;
        this.maxAllocatedPatient = maxAllocatedPatient;
        this.minAllocatedPatient = minAllocatedPatient;
//        this.employeeShift = new EmployeeShiftDTO(shiftId,shiftTypeId,shiftDate,shiftType,shiftDesc);
    }

    public ClinicEmployeeDTO(Integer clinicId, Long clinicEmployeeId, String firstName, String lastName, String gender,
                             String address, String phoneNumber, Long salary, String ssn,
                             Date dob, Integer yearsExperience, Boolean isOwner, Boolean isActive,
                             Integer maxAllocatedPatient, Integer minAllocatedPatient,
                             String employeeNumber){
        this.clinicId = clinicId;
        this.clinicEmployeeId = clinicEmployeeId;
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.ssn = ssn;
        this.dob = dob;
        this.yearsExperience = yearsExperience;
        this.isOwner = isOwner;
        this.isActive = isActive;
        this.maxAllocatedPatient = maxAllocatedPatient;
        this.minAllocatedPatient = minAllocatedPatient;

    }


    public ClinicEmployeeDTO() {

    }
}
