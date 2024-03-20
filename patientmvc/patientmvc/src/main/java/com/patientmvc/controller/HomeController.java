package com.patientmvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.patientmvc.model.Patient;
import com.patientmvc.service.PatientService;

@Controller
@RequestMapping("/")
@SessionAttributes("patient")
@Scope("prototype")
public class HomeController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/1")
    public ModelAndView test(HttpServletResponse response) throws IOException {
        return new ModelAndView("patientinsert");
    }

    @PostMapping("/insert")
    public String insertPatient(
            @RequestParam("patientId") int patientId,
            @RequestParam("patientName") String patientName,
            @RequestParam("patientLocation") String patientLocation,
            @RequestParam("patientAge") String patientAge,
            @RequestParam("patientGender") String patientGender,
            Model model) {
        Patient patient = new Patient();
        patient.setPatientId(patientId);
        patient.setPatientName(patientName);
        patient.setPatientLocation(patientLocation);
        patient.setPatientAge(patientAge);
        patient.setPatientGender(patientGender);

        patientService.insertPatient(patient);

        model.addAttribute("message", "Patient inserted successfully.");
        return "redirect:/view";
    }

    @GetMapping("/view")
    public String getPatientDetails(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "listpatients";
    }

    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable int id, Model model) {
        patientService.deletePatient(id);
        model.addAttribute("message", "Patient deleted successfully.");
        return "redirect:/view";
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
        return "redirect:/view";
    }
}
