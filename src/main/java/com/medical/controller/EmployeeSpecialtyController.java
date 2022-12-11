package com.medical.controller;


import com.medical.constants.ResourceReference;
import com.medical.model.EmployeeSpecialty;
import com.medical.service.EmployeeSpecialtyService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Employee specialty Controller" ,description = "Manages employee specialty")
public class EmployeeSpecialtyController {


    @Autowired
    EmployeeSpecialtyService employeeSpecialtyService;

    @GetMapping( value = ResourceReference.CLINIC_EMLPLOYEE_DETAILS_SPECIALTY, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<List<EmployeeSpecialty>> getAllPatients(){
        List<EmployeeSpecialty> response = this.employeeSpecialtyService.getAllEmplSpecialty();
        return new ResponseWrapper<>(new Metadata(true,"Provides all specialties"),response);
    }



}
