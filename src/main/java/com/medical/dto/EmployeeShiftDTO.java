package com.medical.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeShiftDTO {
    @JsonProperty("emplShiftId")
    private Long shiftId;
    private int shiftTypeId;
    private Date shiftDate;
    private String shiftType;
    private String shiftDesc;


    public EmployeeShiftDTO(long shiftId, int shiftTypeId, Date shiftDate, String shiftType, String shiftDesc) {
        this.shiftTypeId = shiftTypeId;
        this.shiftId = shiftId;
        this.shiftDate = shiftDate;
        this.shiftType = shiftType;
        this.shiftDesc = shiftDesc;
    }
}
