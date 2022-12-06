package com.medical.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="shift_type", schema= "DMSD_MEDICAL")
//@Getter
//@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeShiftType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "shift_id")
    private Long shiftId;

    @Column(name = "shift_type")
    private String shiftType;

    @Column(name = "shift_desc")
    private String shiftDesc;

    @OneToMany(mappedBy = "shiftType")
    @JsonIgnore
            @Transient
    List<EmployeeShift> shifts;

}
