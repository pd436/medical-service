package com.medical.service.impl;


import com.medical.model.EmployeeShiftType;

import com.medical.repository.ClinicEmployeeShiftTypeRepository;
import com.medical.service.ClinicEmployeeShiftTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicEmployeeShiftTypeServiceImpl implements ClinicEmployeeShiftTypeService {

    @Autowired
    ClinicEmployeeShiftTypeRepository employeeShiftTypeRepository;


    @Override
    public List<EmployeeShiftType> findAllShiftTypes() {
        return employeeShiftTypeRepository.findAllShiftTypes();
    }
}
