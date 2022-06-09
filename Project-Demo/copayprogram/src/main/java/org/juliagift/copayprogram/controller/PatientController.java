package org.juliagift.copayprogram.controller;


import org.juliagift.copayprogram.entity.Patient;
import org.juliagift.copayprogram.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/patients")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	//@GetMapping("/{id}")
	@GetMapping("/patients/{id}")
	public String getPatientById(Model model, @PathVariable("id") Long id) throws ChangeSetPersister.NotFoundException {
		Patient patient = patientService.getPatientById(id);
		model.addAttribute("patient", patient);
		return "patientbyid";
	}
	
//	@PostMapping("/patients/{id}")
//	public RedirectView updatePatient(RedirectAttributes redirectAttributes, @PathVariable("id") Long id, 
//			@ModelAttribute Patient patient) throws ChangeSetPersister.NotFoundException {
//		patientService.updatePatient(id, patient);
//		RedirectView redirectView = new RedirectView("/patients");
//		return redirectView;
//	}
	
	
//	@PutMapping("/patients/update/{id}")
//	public String updatePatient(Model model, @PathVariable("id") Long id, @ModelAttribute Patient patient) throws ChangeSetPersister.NotFoundException {
//		Patient patientInfo = patientService.updatePatient(id, patient);
//		model.addAttribute("patientInfo", patientInfo);
//		return "edit";
//	}
//	public String updatePatient(Model model, @PathVariable("id") Long id) throws ChangeSetPersister.NotFoundException {
//		Patient patientInfo = patientService.updatePatient(id, patient);
//		model.addAttribute("patientInfo", patientInfo);
//		return "edit";
//	}
	
}
