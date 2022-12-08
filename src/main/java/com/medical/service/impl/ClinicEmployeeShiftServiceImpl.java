package com.medical.service.impl;

import com.medical.dto.EmployeeShiftDTO;
import com.medical.model.EmployeeShift;
import com.medical.repository.ClinicEmployeeShiftRepository;
import com.medical.service.ClinicEmployeeShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ClinicEmployeeShiftServiceImpl implements ClinicEmployeeShiftService {

    @Autowired
    ClinicEmployeeShiftRepository clinicEmployeeShiftRepository;

    @Override
    public int saveEmployeeShift(String emplId, String shiftDate,String shiftTypeID) {

        return clinicEmployeeShiftRepository.saveEmployeeShift(Integer.valueOf(emplId),Integer.valueOf(shiftTypeID),new Date(shiftDate));
    }

    @Override
    public List<EmployeeShiftDTO> getEmployeeShift(int employeeId) {
        return clinicEmployeeShiftRepository.getEmployeeShiftDetails(employeeId);
    }
}
