package com.medical.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
