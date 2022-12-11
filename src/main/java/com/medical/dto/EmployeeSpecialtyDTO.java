package com.medical.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeSpecialtyDTO {

    private int specialtyId;
    private String specialty;

    public EmployeeSpecialtyDTO(int specialtyId, String specialty) {
        this.specialtyId = specialtyId;
        this.specialty = specialty;
    }
}
