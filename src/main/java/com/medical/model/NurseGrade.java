package com.medical.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="nurse_grade", schema= "DMSD_MEDICAL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NurseGrade {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="grade_id")
    private Integer gradeId;

    @Column(name="grade")
    private Character grade;

    @OneToOne(mappedBy = "nurseGrade")
    private ClinicEmployee clinicEmployee;

}
