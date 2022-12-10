package com.medical.mapstruct.mappers.impl;

import com.medical.dto.*;
import com.medical.mapstruct.mappers.IMedicalMapper;
import com.medical.model.ClinicEmployee;
import com.medical.model.Patient;

import javax.annotation.processing.Generated;


@Generated(value = "org.mapstruct.ap.MappingProcessor")
public class MedicalMapper implements IMedicalMapper {


    @Override
    public ClinicEmployeeDTO clinicEmployeeToClinicEmployeeDto(ClinicEmployee ce) {

        ClinicEmployeeDTO cesDTO = new ClinicEmployeeDTO();

        cesDTO.setClinicId(ce.getClinicId());
        cesDTO.setClinicEmployeeId(ce.getClinicEmployeeId());
        cesDTO.setEmployeeNumber(ce.getEmployeeNumber());
        cesDTO.setDob(ce.getDob());
        cesDTO.setAddress(ce.getAddress());
        cesDTO.setGender(ce.getGender());
        cesDTO.setFirstName(ce.getFirstName());
        cesDTO.setLastName(ce.getLastName());
        cesDTO.setSsn(ce.getSsn());
        cesDTO.setSalary(ce.getSalary());
        cesDTO.setIsActive(ce.getIsActive());
        cesDTO.setMaxAllocatedPatient(ce.getMaxAllocatedPatient());
        cesDTO.setYearsExperience(ce.getYearsExperience());
        cesDTO.setMinAllocatedPatient(ce.getMinAllocatedPatient());
        cesDTO.setPhoneNumber(ce.getPhoneNumber());
        cesDTO.setIsOwner(ce.getIsOwner());
        cesDTO.setOccupation(new EmployeeOccupationDTO(ce.getOccupation().getOccupationId(),ce.getOccupation().getOccupation()));
        cesDTO.setContract(new EmployeeContractDTO(ce.getContract().getContractTypeId(),ce.getContract().getContractType(),ce.getContract().getContractLength()));
        cesDTO.setNurseGrade(new EmployeeNurseGradeDTO(ce.getNurseGrade().getGradeId(),ce.getNurseGrade().getGrade()));
        cesDTO.setSpecialty(new EmployeeSpecialtyDTO(ce.getSpecialty().getSpecialtyId(),ce.getSpecialty().getSpecialty()));


        return cesDTO;
    }

    @Override
    public ClinicPatientDTO clinicPatientToClinicPatientDto(Patient patient) {
        ClinicPatientDTO clinicPatientDTO = new ClinicPatientDTO();

        clinicPatientDTO.setPatientId((patient.getPatientId()));
        clinicPatientDTO.setFirstName(patient.getFirstName());
        clinicPatientDTO.setLastName(patient.getLastName());
        clinicPatientDTO.setGender(patient.getGender());
        clinicPatientDTO.setDob(patient.getDob());
        clinicPatientDTO.setSsn(patient.getSsn());
        clinicPatientDTO.setAddress(patient.getAddress());
        clinicPatientDTO.setTelephone(patient.getTelephone());

        return clinicPatientDTO;
    }


}
