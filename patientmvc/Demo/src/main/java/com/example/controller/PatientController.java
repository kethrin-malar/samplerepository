package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.PatientController;
import com.example.dao.PatientDao;
import com.example.model.Patient;

@Controller
@Scope("prototype")
@RequestMapping("/")
public class PatientController {
    @Autowired
    PatientDao dao;

    @RequestMapping("/patientform")
    public String showForm() {
        return "patientform";
    }

    @RequestMapping(value = "/savePatient", method = RequestMethod.POST)
    public String save(@ModelAttribute("patient") Patient patient) {
        dao.save(patient);
        return "patientform";
    }

    @RequestMapping("/viewpatients")
    public String viewPatients(Model model) {
        List<Patient> list = dao.getPatients();
        model.addAttribute("list", list);
        return "viewpatients";
    }

    @RequestMapping(value = "/editpatient/{id}")
    public String edit(@PathVariable int id, Model model) {
        Patient patient = dao.getPatientById(id);
        model.addAttribute("command", patient);
        return "patienteditform";
    }

    @RequestMapping(value = "/editsavepatient", method = RequestMethod.POST)
    public String editsave(@ModelAttribute("patient") Patient patient) {
        dao.update(patient);
        return "redirect:/viewpatients";
    }

    @RequestMapping(value = "/deletepatient/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {
        dao.delete(id);
        return "redirect:/viewpatients";
    }
}