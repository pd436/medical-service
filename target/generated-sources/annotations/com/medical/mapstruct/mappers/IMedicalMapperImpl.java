package com.medical.mapstruct.mappers;

import com.medical.dto.ClinicEmployeeShiftDTO;
import com.medical.dto.EmployeeContractDTO;
import com.medical.dto.EmployeeNurseGradeDTO;
import com.medical.dto.EmployeeOccupationDTO;
import com.medical.dto.EmployeeSpecialtyDTO;
import com.medical.model.ClinicEmployee;
import com.medical.model.EmployeeSpecialty;
import com.medical.model.NurseGrade;
import com.medical.model.Occupation;
import com.medical.model.SurgeonContract;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-07T20:28:17-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class IMedicalMapperImpl implements IMedicalMapper {

    @Override
    public ClinicEmployeeShiftDTO clinicEmployeeToClinicEmployeeDto(ClinicEmployee clinicEmployee) {
        if ( clinicEmployee == null ) {
            return null;
        }

        ClinicEmployeeShiftDTO clinicEmployeeShiftDTO = new ClinicEmployeeShiftDTO();

        clinicEmployeeShiftDTO.setClinicId( clinicEmployee.getClinicId() );
        clinicEmployeeShiftDTO.setClinicEmployeeId( clinicEmployee.getClinicEmployeeId() );
        clinicEmployeeShiftDTO.setEmployeeNumber( clinicEmployee.getEmployeeNumber() );
        clinicEmployeeShiftDTO.setFirstName( clinicEmployee.getFirstName() );
        clinicEmployeeShiftDTO.setLastName( clinicEmployee.getLastName() );
        clinicEmployeeShiftDTO.setGender( clinicEmployee.getGender() );
        clinicEmployeeShiftDTO.setAddress( clinicEmployee.getAddress() );
        clinicEmployeeShiftDTO.setPhoneNumber( clinicEmployee.getPhoneNumber() );
        clinicEmployeeShiftDTO.setSalary( clinicEmployee.getSalary() );
        clinicEmployeeShiftDTO.setSsn( clinicEmployee.getSsn() );
        clinicEmployeeShiftDTO.setDob( clinicEmployee.getDob() );
        clinicEmployeeShiftDTO.setYearsExperience( clinicEmployee.getYearsExperience() );
        clinicEmployeeShiftDTO.setIsOwner( clinicEmployee.getIsOwner() );
        clinicEmployeeShiftDTO.setIsActive( clinicEmployee.getIsActive() );
        clinicEmployeeShiftDTO.setMaxAllocatedPatient( clinicEmployee.getMaxAllocatedPatient() );
        clinicEmployeeShiftDTO.setMinAllocatedPatient( clinicEmployee.getMinAllocatedPatient() );
        clinicEmployeeShiftDTO.setOccupation( occupationToEmployeeOccupationDTO( clinicEmployee.getOccupation() ) );
        clinicEmployeeShiftDTO.setContract( surgeonContractToEmployeeContractDTO( clinicEmployee.getContract() ) );
        clinicEmployeeShiftDTO.setNurseGrade( nurseGradeToEmployeeNurseGradeDTO( clinicEmployee.getNurseGrade() ) );
        clinicEmployeeShiftDTO.setSpecialty( employeeSpecialtyToEmployeeSpecialtyDTO( clinicEmployee.getSpecialty() ) );

        return clinicEmployeeShiftDTO;
    }

    protected EmployeeOccupationDTO occupationToEmployeeOccupationDTO(Occupation occupation) {
        if ( occupation == null ) {
            return null;
        }

        int occupationId = 0;
        String occupation1 = null;

        if ( occupation.getOccupationId() != null ) {
            occupationId = occupation.getOccupationId();
        }
        occupation1 = occupation.getOccupation();

        EmployeeOccupationDTO employeeOccupationDTO = new EmployeeOccupationDTO( occupationId, occupation1 );

        return employeeOccupationDTO;
    }

    protected EmployeeContractDTO surgeonContractToEmployeeContractDTO(SurgeonContract surgeonContract) {
        if ( surgeonContract == null ) {
            return null;
        }

        int contractTypeId = 0;
        String contractType = null;
        int contractLength = 0;

        if ( surgeonContract.getContractTypeId() != null ) {
            contractTypeId = surgeonContract.getContractTypeId();
        }
        contractType = surgeonContract.getContractType();
        if ( surgeonContract.getContractLength() != null ) {
            contractLength = surgeonContract.getContractLength();
        }

        EmployeeContractDTO employeeContractDTO = new EmployeeContractDTO( contractTypeId, contractType, contractLength );

        return employeeContractDTO;
    }

    protected EmployeeNurseGradeDTO nurseGradeToEmployeeNurseGradeDTO(NurseGrade nurseGrade) {
        if ( nurseGrade == null ) {
            return null;
        }

        int gradeId = 0;
        String grade = null;

        if ( nurseGrade.getGradeId() != null ) {
            gradeId = nurseGrade.getGradeId();
        }
        grade = nurseGrade.getGrade();

        EmployeeNurseGradeDTO employeeNurseGradeDTO = new EmployeeNurseGradeDTO( gradeId, grade );

        return employeeNurseGradeDTO;
    }

    protected EmployeeSpecialtyDTO employeeSpecialtyToEmployeeSpecialtyDTO(EmployeeSpecialty employeeSpecialty) {
        if ( employeeSpecialty == null ) {
            return null;
        }

        int specialtyId = 0;
        String specialty = null;

        if ( employeeSpecialty.getSpecialtyId() != null ) {
            specialtyId = employeeSpecialty.getSpecialtyId();
        }
        specialty = employeeSpecialty.getSpecialty();

        EmployeeSpecialtyDTO employeeSpecialtyDTO = new EmployeeSpecialtyDTO( specialtyId, specialty );

        return employeeSpecialtyDTO;
    }
}
