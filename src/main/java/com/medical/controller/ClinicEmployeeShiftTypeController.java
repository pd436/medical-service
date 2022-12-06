package com.medical.controller;


import com.medical.constants.ResourceReference;
import com.medical.model.EmployeeShiftType;
import com.medical.service.ClinicEmployeeShiftTypeService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Shift Types Controller" ,description = "Manages work shift types")
public class ClinicEmployeeShiftTypeController {

    @Autowired
    ClinicEmployeeShiftTypeService clinicEmployeeShiftTypeService;


    @GetMapping( value = ResourceReference.CLINIC_EMLPLOYEE_SHIFT_TYPE_ALL, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<List<EmployeeShiftType>> findAllShifts(){
        List<EmployeeShiftType> response = this.clinicEmployeeShiftTypeService.findAllShiftTypes();
        return new ResponseWrapper<>(new Metadata(true,"Provides all shift types"),response);
    }


}
