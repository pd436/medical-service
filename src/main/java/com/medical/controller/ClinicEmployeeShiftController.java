package com.medical.controller;


import com.medical.constants.ResourceReference;
import com.medical.dto.EmployeeShiftDTO;
import com.medical.service.ClinicEmployeeShiftService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Employee Work Shift Controller" ,description = "Manages employee work shift")
public class ClinicEmployeeShiftController {

    @Autowired
    ClinicEmployeeShiftService clinicEmployeeShiftService;

    @PostMapping( value = ResourceReference.CLINIC_EMLPLOYEE_SHIFT_SAVE, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<Integer> saveEmployeeShift(@RequestParam String shiftDate,@RequestParam String emplId,@RequestParam String shiftTypeId){
        int result = this.clinicEmployeeShiftService.saveEmployeeShift(emplId,shiftDate,shiftTypeId);
        return new ResponseWrapper<>(new Metadata(true,"Saves Employee Shifts"),Integer.valueOf(result));
    }

    @PostMapping( value = ResourceReference.CLINIC_EMLPLOYEE_SHIFT_DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<Integer> removeEmployeeShift(@RequestParam String emplShiftId){
        this.clinicEmployeeShiftService.removeEmployeeShift(Long.valueOf(emplShiftId));
        return new ResponseWrapper<>(new Metadata(true,"Saves Employee Shifts"),null);
    }

    @GetMapping( value = ResourceReference.CLINIC_EMLPLOYEE_SHIFT_BY_EMPL_ID, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<List<EmployeeShiftDTO>>getEmployeeShift(@PathVariable int employeeId){
        List<EmployeeShiftDTO> result = this.clinicEmployeeShiftService.getEmployeeShift(employeeId);
        return new ResponseWrapper<>(new Metadata(true,"Saves Employee Shifts"),result);
    }
}
