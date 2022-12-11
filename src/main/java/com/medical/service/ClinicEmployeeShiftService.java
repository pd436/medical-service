package com.medical.service;


import com.medical.dto.EmployeeShiftDTO;

import java.util.List;

public interface ClinicEmployeeShiftService {

    public int saveEmployeeShift(String emplId, String shiftDate,String shiftTypeID);

    public void removeEmployeeShift(Long emplShiftId);

    public List<EmployeeShiftDTO> getEmployeeShift(int employeeId);
}
