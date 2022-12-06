package com.medical.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="nurse_grade", schema= "DMSD_MEDICAL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NurseGrade  implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="grade_id")
    private Integer gradeId;

    @Column(name="grade")
    private String grade;

    @OneToOne(mappedBy = "nurseGrade")
    @JsonIgnore
    @Transient
    private ClinicEmployee clinicEmployee;

}
