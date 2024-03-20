package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.model.Patient;

public class PatientDao {

    private JdbcTemplate jdbcTemplate;

    // Setter method for jdbcTemplate
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Patient patient) {
        String sql = "insert into Patient(patientName, patientLocation, patientAge, patientGender) values(?, ?, ?, ?)";
        return jdbcTemplate.update(sql, patient.getPatientName(), patient.getPatientLocation(),
                patient.getPatientAge(), patient.getPatientGender());
    }

    public int update(Patient patient) {
        String sql = "update Patient set patientName=?, patientLocation=?, patientAge=?, patientGender=? where patientId=?";
        return jdbcTemplate.update(sql, patient.getPatientName(), patient.getPatientLocation(),
                patient.getPatientAge(), patient.getPatientGender(), patient.getPatientId());
    }

    public int delete(int id) {
        String sql = "delete from Patient where patientId=?";
        return jdbcTemplate.update(sql, id);
    }

    public Patient getPatientById(int id) {
        String sql = "select * from Patient where patientId=?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Patient.class));
    }

    public List<Patient> getPatients() {
        return jdbcTemplate.query("select * from Patient", new RowMapper<Patient>() {
            public Patient mapRow(ResultSet rs, int row) throws SQLException {
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
}
