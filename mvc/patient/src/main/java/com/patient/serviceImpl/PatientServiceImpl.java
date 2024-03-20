package com.patient.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.patient.model.Patient;
import com.patient.service.PatientService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertPatient(Patient patient) {
        String sql = "INSERT INTO patient (patientId, patientName, patientLocation, patientAge, patientGender) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, patient.getPatientId(), patient.getPatientName(), patient.getPatientLocation(), patient.getPatientAge(), patient.getPatientGender());
    }

    @Override
    public List<Patient> getAllPatients() {
        String sql = "SELECT * FROM patient";
        return jdbcTemplate.query(sql, new RowMapper<Patient>() {
			@Override
			public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
			    Patient patient = new Patient();
			    patient.setPatientId(rs.getInt("patientId"));
			    patient.setPatientName(rs.getString("patientName"));
			    patient.setPatientLocation(rs.getString("patientLocation"));
			    patient.setPatientAge(rs.getString("patientAge"));
			    patient.setPatientGender(rs.getString("patientGender"));
			    return patient;
			}
		});
    }

    @Override
    public void deletePatient(int id) {
        String sql = "DELETE FROM patient WHERE patientId = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public Patient getPatientById(int id) {
        String sql = "SELECT * FROM patient WHERE patientId = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<Patient>() {
			@Override
			public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
			    Patient patient = new Patient();
			    patient.setPatientId(rs.getInt("patientId"));
			    patient.setPatientName(rs.getString("patientName"));
			    patient.setPatientLocation(rs.getString("patientLocation"));
			    patient.setPatientAge(rs.getString("patientAge"));
			    patient.setPatientGender(rs.getString("patientGender"));
			    return patient;
			}
		});
    }

    @Override
    public void updatePatient(Patient patient) {
        String sql = "UPDATE patient SET patientName = ?, patientLocation = ?, patientAge = ?, patientGender = ? WHERE patientId = ?";
        jdbcTemplate.update(sql, patient.getPatientName(), patient.getPatientLocation(), patient.getPatientAge(), patient.getPatientGender(), patient.getPatientId());
    }
}
