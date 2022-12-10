package com.medical.controller;


import com.medical.constants.ResourceReference;
import com.medical.dto.ClinicPatientDTO;
import com.medical.model.Patient;
import com.medical.service.ClinicPatientService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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


    @PostMapping( value = ResourceReference.PATIENT_ID, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<ClinicPatientDTO> getPatientById(@PathVariable String patient_id){
        ClinicPatientDTO response = this.patientService.getPatientById(Long.valueOf(patient_id));
        return new ResponseWrapper<>(new Metadata(true,"Provides patient information"),response);
    }


    @PostMapping( value = ResourceReference.PATIENT_ILLNESS_SAVE, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<Integer> savePatientIllness(@RequestParam(name="patientId") String patientId, @RequestParam(name="illnessId") String illnessId){
        System.out.println(patientId);
        System.out.println(illnessId);
        Integer result = this.patientService.saveIllnessForPatient(Integer.valueOf(patientId),Integer.valueOf(illnessId));
        return new ResponseWrapper<>(new Metadata(true,"Adds illness for patient"),result);
    }

    @PostMapping( value = ResourceReference.PATIENT_ILLNESS_DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<Integer> deletePatientIllness(@RequestParam(name="patientId") String patientId, @RequestParam(name="illnessId") String illnessId){
        System.out.println(patientId);
        System.out.println(illnessId);
        Integer result = this.patientService.deletellnessForPatient(Integer.valueOf(patientId),Integer.valueOf(illnessId));
        return new ResponseWrapper<>(new Metadata(true,"Deletes illness for patient"),result);
    }


    @PostMapping( value = ResourceReference.PATIENT_ALLERGY_SAVE, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<Integer> savePatientAllergy(@RequestParam(name="patientId") String patientId, @RequestParam(name="allergyId") String allergyId){
        System.out.println(patientId);
        System.out.println(allergyId);
        Integer result = this.patientService.saveAllergyForPatient(Integer.valueOf(patientId),Integer.valueOf(allergyId));
        return new ResponseWrapper<>(new Metadata(true,"Adds illness for patient"),result);
    }

    @PostMapping( value = ResourceReference.PATIENT_ALLERGY_DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<Integer> deletePatientAllergy(@RequestParam(name="patientId") String patientId, @RequestParam(name="allergyId") String allergyId){
        System.out.println(patientId);
        System.out.println(allergyId);
        Integer result = this.patientService.deleteAllergyForPatient(Integer.valueOf(patientId),Integer.valueOf(allergyId));
        return new ResponseWrapper<>(new Metadata(true,"Deletes allergy for patient"),result);
    }

}
