package com.medical.constants;

public interface ResourceReference {

	static final String CLINIC_EMLPLOYEE_DETAILS = "/clinic-employee";
	
	static final String OCCUPATION = "/occupation";

	static final String PATIENT = "/patient";

	static final String CLINIC_EMLPLOYEE_DETAILS_BY_OCCUPATION = CLINIC_EMLPLOYEE_DETAILS + "/occupation/{occupationId}";
	static final String PATIENT_ID = PATIENT + "/{patient_id}";

	static final String ALLERGY = "/allergy";

	static final String PATIENT_ALLERGY_SAVE = PATIENT + ALLERGY + "/save";

	static final String PATIENT_ALLERGY_DELETE = PATIENT + ALLERGY + "/delete";

	static final String ALLERGY_BY_IDS = ALLERGY + "/ids";

	static final String ILLNESS = "/illness";

	static final String PATIENT_ILLNESS_SAVE = PATIENT + ILLNESS + "/save";

	static final String PATIENT_ILLNESS_DELETE = PATIENT + ILLNESS + "/delete";

	static final String PATIENT_APPT_ADD = PATIENT + "/appt/add";

	static final String PATIENT_APPT_REMOVE = PATIENT + "/appt/delete";

	static final String ILLNESS_BY_IDS = ILLNESS + "/ids";

	static final String CLINIC_EMLPLOYEE_DETAILS_SPECIALTY = CLINIC_EMLPLOYEE_DETAILS + "/specialty";

	static final String CLINIC_EMLPLOYEE_DETAILS_NURSE_GRADES = CLINIC_EMLPLOYEE_DETAILS + "/nurse-grades";

	static final String CLINIC_EMLPLOYEE_DETAILS_SURGEON_CONTRACT = CLINIC_EMLPLOYEE_DETAILS + "/surgeon-contract";

	static final String CLINIC_EMLPLOYEE_REMOVE = CLINIC_EMLPLOYEE_DETAILS + "/remove/{employeeId}";

	static final String CLINIC_EMLPLOYEE_BY_ID = CLINIC_EMLPLOYEE_DETAILS + "/{employeeId}";

	static final String CLINIC_EMLPLOYEE_SHIFT = CLINIC_EMLPLOYEE_DETAILS + "/shift";

	static final String CLINIC_EMLPLOYEE_SHIFT_SAVE = CLINIC_EMLPLOYEE_SHIFT + "/save";

	static final String CLINIC_EMLPLOYEE_SHIFT_DELETE = CLINIC_EMLPLOYEE_SHIFT + "/remove";

	static final String CLINIC_EMLPLOYEE_SHIFT_TYPE_ALL = CLINIC_EMLPLOYEE_SHIFT + "/type/all";

	static final String CLINIC_EMLPLOYEE_SHIFT_BY_EMPL_ID = CLINIC_EMLPLOYEE_DETAILS + "/{employeeId}/shift";

}
