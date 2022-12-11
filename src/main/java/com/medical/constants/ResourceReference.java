package com.medical.constants;

public interface ResourceReference {
	
	// Reference End points
	
	static final String NURSING_UNITS = "/clinic-nursing-units"; 
	static final String SURGERY_TYPES = "/clinic-surgery-types"; 
	
	// Application End points

	static final String CLINIC_EMLPLOYEE_DETAILS = "/clinic-employees";
	
	static final String OCCUPATION = "/occupation";

	static final String PATIENT = "/patient";
	static final String PATIENT_BY_ID = PATIENT + "/{patient_id}";

	static final String ALLERGY = "/allergy";

	static final String ALLERGY_BY_IDS = ALLERGY + "/ids";

	static final String ILLNESS = "/illness";

	static final String ILLNESS_BY_IDS = ILLNESS + "/ids";
	
	
	
	// Check for available room/bed
	static final String CLINIC_ROOMS= "/clinic-rooms";
	
	static final String CLINIC_ROOMS_BY_PATIENT_ID= "/clinic-rooms/patient/{patientId}";
	
	//Assign/remove a patent to a room/bed
	static final String PATIENT_BY_ROOM_ID="/patient/{patientId}/room/{roomId}/clinic-room";
	
	
	//Assign/remove a doctor to a patient
	static final String PATIENT_BY_DOCTOR= "/patient/{patientId}/clinic-employee/{employeeId}/doctor";
	
	
	//Assign/remove a nurse to a patient
	static final String PATIENT_BY_NURSE= "/patient/{patientId}/clinic-employee/{employeeId}/nurse";
	
	
	static final String BOOK_SURGERY= "/book-surgery";
	
	//View scheduled surgery per surgeon
	static final String SURGERY_SURGEON_VIEW = "/surgery/surgeon-view";
	//Details scheduled surgery per surgeon
	static final String SURGERIES_BY_EMPLOYEE_ID= "/surgery/clinic-employee/{employeeId}";
	
	
	//View scheduled surgery per surgeon
	static final String SURGERY_PATIENT_VIEW = "/surgery/patient-view";
	//Details of scheduled surgeries by patient
	static final String SURGERIES_BY_PATIENT_VIEW= "/surgery/patient/{patientId}";
	
	//View scheduled surgery per room
	static final String SURGERIES_BY_ROOM_ID= "/surgery/room/{roomId}";
	
	
	// MOCK DATA API's
	static final String MOCK_EMPLOYEE ="/mock/employees";
	static final String MOCK_PATIENTS ="/mock/patients";
	
		
		
	//Assign/remove a nurse to a patient , distinguish based on employee Type
	static final String PATIENT_ASSIGNMENT=PATIENT_BY_ID+CLINIC_EMLPLOYEE_DETAILS+"/{employeeId}";
	
	//View scheduled surgery per room and per day
	static final String ROOM_SCHEDULE=CLINIC_ROOMS+"/{roomId}/room-surgery-schedules";
	
	//surgery details
	static final String SUREGERY_DETAILS="/surgery-details";
	
	//View scheduled surgery per surgeon and per day 
	static final String SURGEON_SCHEDULE="/surgeons/{surgeonId}/surgeon-schedule";
	
	
	
	//SURGERY
	static final String SURGERY = PATIENT_BY_ID+"surgery";
	
	

	// Reference End points

	
	
	
	
}
