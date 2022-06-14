package org.juliagift.copayprogram.controller;

import java.util.List;

import org.juliagift.copayprogram.entity.Patient;
import org.juliagift.copayprogram.exception.PatientNotFoundException;
import org.juliagift.copayprogram.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
//@RequestMapping("/patients")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	//display list of patients
		@GetMapping("/patients")
		public String getAllPatients(Model model) {
			List<Patient> patients = patientService.getAllPatients();
			
//			patients.forEach(patient -> {
//				System.out.println(patient);
//			});
//			
			model.addAttribute("patients", patients);

			return "index";
		}
//		
//		@GetMapping("/showNewPatientForm")
//		 public String showNewEmployeeForm(Model model) {
//		     // create model attribute to bind form data
//		     Patient patient = new Patient();
//		     model.addAttribute("patient", patient);
//		     return "new_patient";
//		 }
//		
//		@PostMapping("/savePatient")
//		 public String savePatient(@ModelAttribute("patient") Patient patient) {
//		     // save patient to database
//		     patientService.savePatient(patient);
//		     return "redirect:/";
//		 }
//		
//	
//		@GetMapping("/showFormForUpdate/{id}")
//		public String getPatientById(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttributes) throws PatientNotFoundException{
//			// get patient from the service
//			Patient patient = patientService.getPatientById(id);
//			
//			 // set patient as a model attribute to pre-populate the form
//			model.addAttribute("patient", patient);
//			redirectAttributes.addFlashAttribute("message", "The user has been updated successfully.");
//	
//			//return "patientbyid";
//			return "update_patient";
//		}
//		
//		@DeleteMapping("/deletePatient/{id}")
//		public String deletePatient(@PathVariable ("id") Long id) {
//		 
//		 // call delete patient method 
//		 try {
//			patientService.deletePatientById(id);
//		} catch (PatientNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 return "redirect:/";
//		}
//		
//		
//		
		
		
		
		
	

	@GetMapping("/patient/{id}")
	public String getPatientById(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttributes) throws PatientNotFoundException{
		Patient patient = patientService.getPatientById(id);
		model.addAttribute("patient", patient);
		redirectAttributes.addFlashAttribute("userMessage", "The user has been saved successfully.");

		return "patientbyid";
	}
	
	
	
	

	//showUpdateForm() method is responsible for fetching the User entity that matches the supplied id from the database.
	//If the entity exists, it will be passed on as a model attribute to the update form view.
	//So, the form can be populated with the values of the  fields
	@GetMapping("/showeditform/{id}")
	public String showEditForm(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttributes) throws PatientNotFoundException {
		//get patient from service
		
		try {
		Patient patient = patientService.getPatientById(id);
		
		//set patient as a model attribute and pre-populate the form
		model.addAttribute("patient", patient);
		model.addAttribute("pageTitle", "Edit Patient Details (ID: " + id +")");
		return "editForm";
		} catch (PatientNotFoundException e) {
			redirectAttributes.addFlashAttribute("userMessage", "The user has been saved successfully.");
			return "redirect:/patient/{id}";
		}
		
		
	}
	

	
	
	
	
	@DeleteMapping("/delete/{id}")
	public String deletePatientById(@PathVariable("id") Long id, Model model,
			RedirectAttributes redirectAttributes) throws PatientNotFoundException {
		
		patientService.deletePatientById(id);
//		model.addAttribute("patient", patient);
//		String message = patient.getFirstName() + "Your account has been deleted";
//		redirectAttributes.addFlashAttribute("userMessage", message);
		return "redirect:/patients";
	}
	
//	@DeleteMapping("/delete/{id}")
//	public String deletePatientById(@PathVariable("id") Long id, Model model) throws PatientNotFoundException {
//		
//		Patient patient= patientService.deletePatientById(id);
//		System.out.println(patient.getFirstName());
//		model.addAttribute("patient", patient);
//		
//		return "patients";
//
//	}
	
	
	
	
//	@PutMapping("/update/{id}")
//	public String updatePatient(@PathVariable("id") Long id, @Valid Patient patient, 
//			BindingResult bindingResult, Model model) {
//		System.out.println(patient);
//		if(bindingResult.hasErrors()) {
//			patient.setPatientId(id);
//			System.out.println("HERE");
//			return "editForm";//if there are errors, redirect here
//		}
//		model.addAttribute("patient", patientService.savePatient(patient));
//		model.addAttribute("pageTitle", "Update Patient (ID: " + id +")");
//		patientService.savePatient(patient);
//		return "update";//if no errors, proceed to page
//	}
//	
//	
//	@PostMapping("/patients/save")
//	public String savePatient(@ModelAttribute Patient patient, RedirectAttributes redirectAttributes) {
//		//save patient to database
//		patientService.savePatient(patient);
//		redirectAttributes.addFlashAttribute("userMessage", "The user has been saved successfully.");
//		
//		return "redirect:/patient/{id}";
//	}
//	
//	@DeleteMapping("/delete/{id}")
//	public String deletePatient(@PathVariable("id") Long id) throws PatientNotFoundException {
//		patientService.deletePatientById(id);
//		
//		return "redirect:/patient/{id}";
//	}
	
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
	
//	@PutMapping("/edit/{id}")
//	public String updatePatient(Model model, @PathVariable("id") Long id) {
//		Patient patientDetails = patientService.updatePatient(id, patient);
//		model.addAttribute("patientInfo", patientInfo);
//		return "userEditForm";
//	}
	
//	public RedirectView updatePatient(RedirectAttributes redirectAttributes, @PathVariable("id") Long id, 
//			@ModelAttribute Patient patient) throws PatientNotFoundException {
//		patientService.updatePatient(id, patient);
//		
//		String message = patient.getFirstName() + ", your profile information has been updated </b> ✨.";
//		RedirectView redirectView = new RedirectView("/edit/{id}", true);
//		redirectAttributes.addFlashAttribute("userMessage", message);
//		
//		return redirectView;
//		
//	}
	
	
	
}
