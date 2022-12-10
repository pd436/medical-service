package com.medical.controller;


import com.medical.constants.ResourceReference;
import com.medical.model.Allergy;
import com.medical.service.AllergyService;
import com.medical.vo.Metadata;
import com.medical.vo.ResponseWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@Tag(name = "Allergy Controller" ,description = "Manages allergies")
public class AllergyController {
    @Autowired
    AllergyService allergyService;

    @PostMapping( value = ResourceReference.ALLERGY_BY_IDS, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<List<Allergy>> getAllergyByIds(@RequestBody List<Allergy> allergies){
        List<Allergy> response = this.allergyService.getAllergyByIds(allergies);
        return new ResponseWrapper<>(new Metadata(true,"Provides allergy information"),response);
    }


    @GetMapping( value = ResourceReference.ALLERGY, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<List<Allergy>> getAllAllergies(){
        List<Allergy> response = this.allergyService.getAllAllergies();
        return new ResponseWrapper<>(new Metadata(true,"Provides allergy information"),response);
    }
}
