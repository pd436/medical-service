package com.medical.controller;


import com.medical.constants.ResourceReference;
import com.medical.model.NurseGrade;
import com.medical.service.NurseGradeService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Nurse grade Controller" ,description = "Manages nurse grades")
public class NurseGradeController {

    @Autowired
    NurseGradeService nurseGradeService;

    @GetMapping( value = ResourceReference.CLINIC_EMLPLOYEE_DETAILS_NURSE_GRADES, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<List<NurseGrade>> getAllSurgeonContracts(){
        List<NurseGrade> response = this.nurseGradeService.getAllNurseGrades();
        return new ResponseWrapper<>(new Metadata(true,"Provides all grades for nurse"),response);
    }
}
