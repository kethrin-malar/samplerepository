package com.patient.controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.patient.model.Patient;
import com.patient.service.PatientService;
@RequestMapping(value="/")
@SessionAttributes("patient")
@Controller
public class PatientController {

	
	
	    @Autowired
	    private PatientService patientService;

	    @GetMapping("/add")
	    public String showInsertForm(Model model) {
	        model.addAttribute("patient", new Patient());
	        System.out.println("2");
	        return "patientinsert"; 
	      
	    }

	    @PostMapping("/insert")
	    public String insertPatient(@ModelAttribute("patient") Patient patient, Model model) {
	        patientService.insertPatient(patient);
	        System.out.println("1");

	        model.addAttribute("message", "Patient inserted successfully.");
	        return "redirect:/patients/view";
	    }

	    @GetMapping("/view")
	    public String getPatientDetails(Model model) {
	        List patients = (List)patientService.getAllPatients();
	        model.addAttribute("patients", patients);
	        return "listpatients";
	    }

	    @GetMapping("/delete/{id}")
	    public String deletePatient(@PathVariable int id, Model model) {
	        patientService.deletePatient(id);
	        model.addAttribute("message", "Patient deleted successfully.");
	        return "redirect:/patients/view";
	    }

	    @GetMapping("/updateform/{id}")
	    public String showUpdateForm(@PathVariable int id, Model model) {
	        Patient patient = patientService.getPatientById(id);
	        model.addAttribute("patient", patient);
	        return "updateform";
	    }

	    @PostMapping("/update")
	    public String updatePatient(@ModelAttribute("patient") Patient patient, Model model) {
	        patientService.updatePatient(patient);
	        model.addAttribute("message", "Patient updated successfully.");
	        return "redirect:/patients/view";
	    }
	}
