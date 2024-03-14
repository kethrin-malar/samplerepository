package com.example.demo.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;

@Service
public class PatientService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addPatient(Patient patient) {
		String sql = "INSERT INTO Patient (PatientId, PatientName, PatientLocation, PatientAge, PatientGender) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, patient.getPatientId(), patient.getPatientName(), patient.getPatientLocation(),
				patient.getPatientAge(), patient.getPatientGender());
	}
	
	public List<Map<String, Object>> getAllPatients() {
        String sql = "SELECT * FROM Patient";
        return jdbcTemplate.queryForList(sql);
    }
	
	 public void updatePatient(Patient patient) {
	        String sql = "UPDATE Patient SET PatientName = ?, PatientLocation = ?, PatientAge = ?, PatientGender = ? WHERE PatientId = ?";
	        jdbcTemplate.update(sql, patient.getPatientName(), patient.getPatientLocation(), patient.getPatientAge(), patient.getPatientGender(), patient.getPatientId());
	    }
	
	 public void deletePatient(int patientId) {
	        String sql = "DELETE FROM Patient WHERE PatientId = ?";
	        jdbcTemplate.update(sql, patientId);
	    }
}
