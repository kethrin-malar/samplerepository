package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@PostMapping("/add")
	public String addPatient(@RequestBody Patient patient) {
		patientService.addPatient(patient);
		return "Patient added successfully";
	}
	
	@GetMapping("/all")
	public List<Map<String, Object>> getAllPatients() {
	return patientService.getAllPatients();
	}
	
	 @PutMapping("/update/{id}")
	    public String updatePatient(@PathVariable int id, @RequestBody Patient patient) {
	        patient.setPatientId(id);
	        patientService.updatePatient(patient);
	        return "Patient updated successfully";
	    }
	 
	 @DeleteMapping("/delete/{id}")
	    public String deletePatient(@PathVariable int id) {
	        patientService.deletePatient(id);
	        return "Patient deleted successfully";
	    }
}

