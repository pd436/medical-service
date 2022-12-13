package com.medical.mapstruct.mappers;

import com.medical.dto.ClinicEmployeeDTO;
import com.medical.dto.ClinicPatientDTO;
import com.medical.dto.EmployeeContractDTO;
import com.medical.dto.EmployeeNurseGradeDTO;
import com.medical.dto.EmployeeOccupationDTO;
import com.medical.dto.EmployeeSpecialtyDTO;
import com.medical.model.ClinicEmployee;
import com.medical.model.EmployeeSpecialty;
import com.medical.model.NurseGrade;
import com.medical.model.Occupation;
import com.medical.model.Patient;
import com.medical.model.SurgeonContract;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-11T17:45:08-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class IMedicalMapperImpl implements IMedicalMapper {

    @Override
    public ClinicEmployeeDTO clinicEmployeeToClinicEmployeeDto(ClinicEmployee clinicEmployee) {
        if ( clinicEmployee == null ) {
            return null;
        }

        ClinicEmployeeDTO clinicEmployeeDTO = new ClinicEmployeeDTO();

        clinicEmployeeDTO.setClinicId( clinicEmployee.getClinicId() );
        clinicEmployeeDTO.setClinicEmployeeId( clinicEmployee.getClinicEmployeeId() );
        clinicEmployeeDTO.setEmployeeNumber( clinicEmployee.getEmployeeNumber() );
        clinicEmployeeDTO.setFirstName( clinicEmployee.getFirstName() );
        clinicEmployeeDTO.setLastName( clinicEmployee.getLastName() );
        clinicEmployeeDTO.setGender( clinicEmployee.getGender() );
        clinicEmployeeDTO.setAddress( clinicEmployee.getAddress() );
        clinicEmployeeDTO.setPhoneNumber( clinicEmployee.getPhoneNumber() );
        clinicEmployeeDTO.setSalary( clinicEmployee.getSalary() );
        clinicEmployeeDTO.setSsn( clinicEmployee.getSsn() );
        clinicEmployeeDTO.setDob( clinicEmployee.getDob() );
        clinicEmployeeDTO.setYearsExperience( clinicEmployee.getYearsExperience() );
        clinicEmployeeDTO.setIsOwner( clinicEmployee.getIsOwner() );
        clinicEmployeeDTO.setIsActive( clinicEmployee.getIsActive() );
        clinicEmployeeDTO.setMaxAllocatedPatient( clinicEmployee.getMaxAllocatedPatient() );
        clinicEmployeeDTO.setMinAllocatedPatient( clinicEmployee.getMinAllocatedPatient() );
        clinicEmployeeDTO.setOccupation( occupationToEmployeeOccupationDTO( clinicEmployee.getOccupation() ) );
        clinicEmployeeDTO.setContract( surgeonContractToEmployeeContractDTO( clinicEmployee.getContract() ) );
        clinicEmployeeDTO.setNurseGrade( nurseGradeToEmployeeNurseGradeDTO( clinicEmployee.getNurseGrade() ) );
        clinicEmployeeDTO.setSpecialty( employeeSpecialtyToEmployeeSpecialtyDTO( clinicEmployee.getSpecialty() ) );

        return clinicEmployeeDTO;
    }

    @Override
    public ClinicPatientDTO clinicPatientToClinicPatientDto(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        ClinicPatientDTO clinicPatientDTO = new ClinicPatientDTO();

        clinicPatientDTO.setPatientId( patient.getPatientId() );
        clinicPatientDTO.setFirstName( patient.getFirstName() );
        clinicPatientDTO.setLastName( patient.getLastName() );
        clinicPatientDTO.setGender( patient.getGender() );
        clinicPatientDTO.setAddress( patient.getAddress() );
        clinicPatientDTO.setSsn( patient.getSsn() );
        clinicPatientDTO.setTelephone( patient.getTelephone() );
        clinicPatientDTO.setDob( patient.getDob() );

        return clinicPatientDTO;
    }

    protected EmployeeOccupationDTO occupationToEmployeeOccupationDTO(Occupation occupation) {
        if ( occupation == null ) {
            return null;
        }

        EmployeeOccupationDTO employeeOccupationDTO = new EmployeeOccupationDTO();

        if ( occupation.getOccupationId() != null ) {
            employeeOccupationDTO.setOccupationId( occupation.getOccupationId() );
        }
        employeeOccupationDTO.setOccupation( occupation.getOccupation() );

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
