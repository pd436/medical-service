package com.medical.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="illness", schema= "DMSD_MEDICAL")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Illness implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "illness_id")
    private Long illnessId;

    @Column(name="code")
    private Integer  code;

    @Column(name="desc")
    private String  desc;

    @Column(name="req_hospitalization")
    @Type(type= "yes_no")
    private Boolean  reqHospitalization;
//
//    @OneToMany(mappedBy = "illness")
//    @JsonIgnore
//    private Set<PatientIllness> patientIllness = new HashSet<>();

}
