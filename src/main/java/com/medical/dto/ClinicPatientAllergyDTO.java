package com.medical.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClinicPatientAllergyDTO {


    private Long allergyId;

    private Integer code;

    private String name;

    public ClinicPatientAllergyDTO(Long allergyId, Integer code, String name) {
        this.allergyId = allergyId;
        this.code = code;
        this.name = name;
    }
}
