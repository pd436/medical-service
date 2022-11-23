package com.medical.controller;


import com.medical.constants.ResourceReference;
import com.medical.model.ClinicEmployee;
import com.medical.model.Patient;
import com.medical.service.ClinicEmployeeService;
import com.medical.service.ClinicPatientService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = ResourceReference.PATIENT)
@Tag(name = "Patient Controller" ,description = "Manages patients")
public class ClinicPatientController {
    @Autowired
    ClinicPatientService patientService;

    @PostMapping(value = ResourceReference.CREATE, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseWrapper<Patient> addPatient(@RequestBody Patient patient) {
        System.out.println(patient);
        Patient response = patientService.addPatient(patient);
        return new ResponseWrapper<>(new Metadata(true,"Provides created patient"),response);
    }


    @GetMapping( value = ResourceReference.ALL, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<List<Patient>> getAllPatients(){
        List<Patient> response = patientService.getAllPatients();
        System.out.println(response);
        return new ResponseWrapper<>(new Metadata(true,"Provides all patients"),response);
    }

}