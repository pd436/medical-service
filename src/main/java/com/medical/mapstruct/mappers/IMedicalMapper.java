package com.medical.mapstruct.mappers;


import com.medical.dto.ClinicEmployeeShiftDTO;
import com.medical.dto.EmployeeOccupationDTO;
import com.medical.model.ClinicEmployee;
import com.medical.model.Occupation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IMedicalMapper {

    IMedicalMapper MAPPER = Mappers.getMapper(IMedicalMapper.class);

    ClinicEmployeeShiftDTO clinicEmployeeToClinicEmployeeDto(ClinicEmployee clinicEmployee);
}
