package com.medical.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeContractDTO {

    private int contractTypeId;

    private String contractType;

    private int contractLength;

    public EmployeeContractDTO(int contractTypeId, String contractType, int contractLength) {
        this.contractTypeId = contractTypeId;
        this.contractType = contractType;
        this.contractLength = contractLength;
    }
}
