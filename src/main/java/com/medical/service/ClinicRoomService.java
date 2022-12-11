package com.medical.service;

import java.util.List;

import com.medical.response.ClinicRooms;
import com.medical.util.Constants.NursingUnitType;
import com.medical.util.Constants.AllotmentType;;

public interface ClinicRoomService {

	public List<ClinicRooms> getClinicRooms(NursingUnitType type);

	public void updateClinicRoomForPatient(Integer patientId, Integer roomId, AllotmentType type);

	List<ClinicRooms> getClinicRoomsByPatientId(Integer patientId);

}
