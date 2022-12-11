package com.medical.service.impl;


import com.medical.model.EmployeeSpecialty;
import com.medical.repository.EmployeeSpecialtyRepository;
import com.medical.service.EmployeeSpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSpecialtyImpl implements EmployeeSpecialtyService {

    @Autowired
    EmployeeSpecialtyRepository employeeSpecialtyRepository;

    @Override
    public List<EmployeeSpecialty> getAllEmplSpecialty() {
        return employeeSpecialtyRepository.findAll();
    }
}
