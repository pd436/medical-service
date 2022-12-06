package com.medical.controller;


import com.medical.constants.ResourceReference;
import com.medical.model.SurgeonContract;
import com.medical.service.SurgeonContractService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Surgeon contract Controller" ,description = "Manages surgeon contracts")
public class SurgeonContractController {

    @Autowired
    SurgeonContractService surgeonContractService;


    @GetMapping( value = ResourceReference.CLINIC_EMLPLOYEE_DETAILS_SURGEON_CONTRACT, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<List<SurgeonContract>> getAllSurgeonContracts(){
        List<SurgeonContract> response = this.surgeonContractService.getAllSurgeonContracts();
        return new ResponseWrapper<>(new Metadata(true,"Provides all contracts for surgeons"),response);
    }
}
