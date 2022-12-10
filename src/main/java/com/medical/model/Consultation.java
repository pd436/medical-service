package com.medical.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="consultation", schema= "DMSD_MEDICAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consultation {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "consultation_id")
    private Long consultationId;

    @Column(name = "patient_id")
    private int patientId;

    @Column(name = "consultation_time")
    private Date consultationDate;

    @Column(name = "physician_id")
    private int physicianId;
}
