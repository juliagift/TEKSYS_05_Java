package org.juliagift.copaydemo.controller;

import org.juliagift.copaydemo.entity.PharmacyEntity;
import org.juliagift.copaydemo.repository.PharmacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/copay")
public class MainController {
	
	@Autowired
	private PharmacyRepository pharmacyRepo;
	
	//localhost:8080/copay/add
	@PostMapping(path="/add")
	public @ResponseBody String addNewPharmacy(@RequestParam String name, @RequestParam String phoneNumber, @RequestParam String address) {
		PharmacyEntity newPharmacy = new PharmacyEntity();
		newPharmacy.setName(name);
		newPharmacy.setPhoneNumber(phoneNumber);
		newPharmacy.setAddress(address);
		pharmacyRepo.save(newPharmacy);
		
		return "save new pharmacy";
	}
	
	//localhost:8080/copay/getall
	@GetMapping(path="/getall")
	public @ResponseBody Iterable<PharmacyEntity> getAllPharmacies() {
		return pharmacyRepo.findAll();
	}
	
	@DeleteMapping(path="/delete")
	public @ResponseBody String deleteUser(@RequestParam Integer id) {
		pharmacyRepo.deleteById(id);
		return "Delete pharmacy";
	}

}
