package com.medical.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeNurseGradeDTO {

    private int gradeId;
    private String grade;

    public EmployeeNurseGradeDTO(int gradeId, String grade) {
        this.gradeId = gradeId;
        this.grade = grade;
    }
}
