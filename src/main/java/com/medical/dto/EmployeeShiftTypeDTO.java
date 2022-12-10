package com.medical.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeShiftTypeDTO {

    private String shiftType;

    private String shiftDesc;

    public EmployeeShiftTypeDTO(String shiftType, String shiftDesc) {
        this.shiftType = shiftType;
        this.shiftDesc = shiftDesc;
    }
}
