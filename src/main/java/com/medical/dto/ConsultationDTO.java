package com.medical.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsultationDTO {


    private Long consultationId;

    private int patientId;

    private Date consultationDate;

    private int physicianId;

    private String physicianName;

    private String physicianLastname;

    public ConsultationDTO(Long consultationId, int patientId, Date consultationDate, int physicianId, String physicianName, String physicianLastname) {
        this.consultationId = consultationId;
        this.patientId = patientId;
        this.consultationDate = consultationDate;
        this.physicianId = physicianId;
        this.physicianName = physicianName;
        this.physicianLastname = physicianLastname;
    }
}
