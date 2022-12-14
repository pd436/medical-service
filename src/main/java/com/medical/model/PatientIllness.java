package com.medical.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;

@Entity
@Table(name="patient_illness", schema= "DMSD_MEDICAL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientIllness {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "patient_illness_id")
    private Long illnessId;

    @ManyToOne
    @JoinColumn(name="patient_id", nullable=false)
    @JsonIgnore
    private Patient patient;

    @ManyToOne
    @JoinColumn(name="illness_id", nullable=false)
    @JsonIgnore
    private Illness illness;

}
