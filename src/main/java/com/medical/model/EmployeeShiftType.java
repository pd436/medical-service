package com.medical.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="shift_type", schema= "DMSD_MEDICAL")
@Getter
@Setter
//@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeShiftType implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    @Column(name = "shift_id")
//    private Long shiftId;
//
//    @Column(name = "shift_type")
//    private String shiftType;
//
//    @Column(name = "shift_desc")
//    private String shiftDesc;
//
//    @OneToMany(mappedBy = "shiftType")
//    @JsonIgnore
//            @Transient
//    private List<EmployeeShift> shifts;


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "shift_id")
    private Long shiftId;

    @Column(name = "shift_type")
    private String shiftType;

    @Column(name = "shift_desc")
    private String shiftDesc;



}
