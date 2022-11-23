package com.medical.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="illness", schema= "DMSD_MEDICAL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Illness {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "illness_id")
    private Integer illnessId;

    @Column(name="code")
    private Integer  code;

    @Column(name="desc")
    private String  desc;

    @Column(name="req_hospitalization")
    @Type(type= "yes_no")
    private Boolean  reqHospitalization;

    @OneToMany(mappedBy = "illness")
    private Set<PatientIllness> patientIllness = new HashSet<>();

}
