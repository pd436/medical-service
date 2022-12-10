package com.medical.controller;

import com.medical.constants.ResourceReference;
import com.medical.model.Illness;
import com.medical.service.IllnessService;
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
@Tag(name = "Illness Controller" ,description = "Manages illnesses")
public class IllnessController {
    @Autowired
    IllnessService illnessService;

    @PostMapping( value = ResourceReference.ILLNESS_BY_IDS, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<List<Illness>> getIllnessByIds(@RequestBody List<Illness> illnesses){
        List<Illness> response = this.illnessService.getIllnessByIds(illnesses);
        return new ResponseWrapper<>(new Metadata(true,"Provides illness information"),response);
    }

    @GetMapping( value = ResourceReference.ILLNESS, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseWrapper<List<Illness>> getAllIlnesses(){
        List<Illness> response = this.illnessService.getAllIllnesses();
        return new ResponseWrapper<>(new Metadata(true,"Provides all illnesses"),response);
    }

}
