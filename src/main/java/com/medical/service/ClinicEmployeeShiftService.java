package com.medical.service;


import com.medical.model.EmployeeShift;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

public interface ClinicEmployeeShiftService {

    public int saveEmployeeShift(String emplId, String shiftDate,String shiftTypeID);

    public List<EmployeeShift> getEmployeeShift(Long employeeId);
}
