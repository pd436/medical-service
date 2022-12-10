package com.medical.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClinicPatientDTO {


    public ClinicPatientDTO() {
    }

    public ClinicPatientDTO(Long patientId, String firstName, String lastName, String gender, String address, String ssn, String telephone, Date dob) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.ssn = ssn;
        this.telephone = telephone;
        this.dob = dob;
    }


    private Long patientId;

    private String  firstName;

    private String  lastName;

    private String  gender;

    private String  address;

    private String  ssn;

    private String  telephone;

    private Date dob;


    private List<ClinicPatientIllnessDTO> illness;

    private List<ClinicPatientAllergyDTO> allergy;

    private List<ConsultationDTO> consultation;

}
