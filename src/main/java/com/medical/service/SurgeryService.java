package com.medical.service;

import java.util.List;

import com.medical.model.SurgerySchedule;
import com.medical.response.SurgeryView;

public interface SurgeryService {

	SurgerySchedule bookSurgerySchedule(SurgerySchedule scheduleRequest);
	
	List<SurgerySchedule> getSurgeryList();

	List<SurgeryView> getSurgeonViewDetails();

	List<SurgeryView> getPatientViewDetails();

	List<SurgeryView> getSurgeryDetailsByClinicEmployee(Integer clinicEmployeeId);

	List<SurgeryView> getSurgeryDetailsByPatientId(Integer patientId); 
	
}
