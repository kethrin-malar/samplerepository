package com.patientmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.patientmvc.model.Patient;


@Service
public class PatientService{
	
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertPatient(Patient patient) {
        String sql = "INSERT INTO patient (patientId, patientName, patientLocation, patientAge, patientGender) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, patient.getPatientId(), patient.getPatientName(), patient.getPatientLocation(), patient.getPatientAge(), patient.getPatientGender());
    }

    public List<Patient> getAllPatients() {
        String sql = "SELECT * FROM patient";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Patient patient = new Patient();
            patient.setPatientId(rs.getInt("patientId"));
            patient.setPatientName(rs.getString("patientName"));
            patient.setPatientLocation(rs.getString("patientLocation"));
            patient.setPatientAge(rs.getString("patientAge"));
            patient.setPatientGender(rs.getString("patientGender"));
            return patient;
        });
    }

    public void deletePatient(int id) {
        String sql = "DELETE FROM patient WHERE patientId = ?";
        jdbcTemplate.update(sql, id);
    }

    public Patient getPatientById(int id) {
        String sql = "SELECT * FROM patient WHERE patientId = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            Patient patient = new Patient();
            patient.setPatientId(rs.getInt("patientId"));
            patient.setPatientName(rs.getString("patientName"));
            patient.setPatientLocation(rs.getString("patientLocation"));
            patient.setPatientAge(rs.getString("patientAge"));
            patient.setPatientGender(rs.getString("patientGender"));
            return patient;
        });
    }

    public void updatePatient(Patient patient) {
        String sql = "UPDATE patient SET patientName = ?, patientLocation = ?, patientAge = ?, patientGender = ? WHERE patientId = ?";
        jdbcTemplate.update(sql, patient.getPatientName(), patient.getPatientLocation(), patient.getPatientAge(), patient.getPatientGender(), patient.getPatientId());
    }
}
