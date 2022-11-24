package com.medical.controller;


import com.medical.constants.ResourceReference;
import com.medical.model.Patient;
import com.medical.service.ClinicPatientService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@Tag(name = "Patient Controller" ,description = "Manages patients")
public class ClinicPatientController {
    @Autowired
    ClinicPatientService patientService;

    @GetMapping( value = ResourceReference.PATIENT, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<List<Patient>> getAllPatients(){
        List<Patient> response = this.patientService.getAllPatients();
        return new ResponseWrapper<>(new Metadata(true,"Provides all patients"),response);
    }

    @PostMapping(value = ResourceReference.PATIENT, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseWrapper<Patient> addPatient(@RequestBody Patient patient) {
        Patient response = this.patientService.addPatient(patient);
        return new ResponseWrapper<>(new Metadata(true,"Provides created patient"),response);
    }


    @PostMapping( value = ResourceReference.PATIENT_BY_ID, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<Patient> getPatientById( @PathVariable String patient_id){
//        Optional<Patient> response = this.patientService.getPatientById(Long.valueOf((patient.getPatientId())));
        Optional<Patient> response = this.patientService.getPatientById(Long.valueOf(patient_id));
        return new ResponseWrapper<>(new Metadata(true,"Provides patient information"),response.get());
    }

}
