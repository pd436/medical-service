package com.medical.mapstruct.mappers;


import com.medical.dto.ClinicEmployeeDTO;
import com.medical.dto.ClinicPatientDTO;
import com.medical.model.ClinicEmployee;
import com.medical.model.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMedicalMapper {

    IMedicalMapper MAPPER = Mappers.getMapper(IMedicalMapper.class);

    ClinicEmployeeDTO clinicEmployeeToClinicEmployeeDto(ClinicEmployee clinicEmployee);

    ClinicPatientDTO clinicPatientToClinicPatientDto(Patient patient);
}
