package com.medical.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClinicPatientIllnessDTO {


    public ClinicPatientIllnessDTO(Long illnessId, Integer code, String desc, Boolean reqHospitalization) {
        this.illnessId = illnessId;
        this.code = code;
        this.desc = desc;
        this.reqHospitalization = reqHospitalization;
    }

    private Long illnessId;

    private Integer  code;

    private String  desc;

    private Boolean  reqHospitalization;
}
