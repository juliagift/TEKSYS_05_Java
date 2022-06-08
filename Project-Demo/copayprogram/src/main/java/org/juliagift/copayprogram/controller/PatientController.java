package org.juliagift.copayprogram.controller;


import org.juliagift.copayprogram.entity.Patient;
import org.juliagift.copayprogram.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/patients/{id}")
	public String getPatientById(Model model, @PathVariable("id") Long id) throws ChangeSetPersister.NotFoundException {
		Patient patient = patientService.getPatientById(id);
		model.addAttribute("patient", patient);
		return "patientbyid";
	}
	
}
