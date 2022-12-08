package com.medical.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeOccupationDTO {

    private int occupationId;
    private String occupation;

    public EmployeeOccupationDTO(int occupationId, String occupation) {
        this.occupationId = occupationId;
        this.occupation = occupation;
    }
}
