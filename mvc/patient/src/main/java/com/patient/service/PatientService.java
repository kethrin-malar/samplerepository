package com.patient.service;



import java.util.List;

import com.patient.model.Patient;

public interface PatientService {
	void insertPatient(Patient patient);

	List<Patient> getAllPatients();

	void deletePatient(int id);

	Patient getPatientById(int id);

	void updatePatient(Patient patient);
}
