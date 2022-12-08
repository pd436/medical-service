package com.medical.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
//@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeShiftID implements Serializable {

    private int clinicEmployee;
    private int shiftType;
}
