package org.juliagift.copayprogram.controller;

import java.util.List;

import org.juliagift.copayprogram.entity.Patient;
import org.juliagift.copayprogram.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManufacturerController {
	
	@Autowired
	private ManufacturerService manufacturerService;

	@GetMapping("/patients")
	public String getAllPatients(Model model) {
		List<Patient> patients = manufacturerService.getAllPatients();
		model.addAttribute("patients", patients);

		return "patient";
	}
	
	
}
