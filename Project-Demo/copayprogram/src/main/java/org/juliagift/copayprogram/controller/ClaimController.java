package org.juliagift.copayprogram.controller;

import java.util.List;

import org.juliagift.copayprogram.entity.Claim;
import org.juliagift.copayprogram.repository.ClaimRepository;
import org.juliagift.copayprogram.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClaimController {
	
	@Autowired
	private ClaimService claimService;
	
	@GetMapping("/claims")
	public String getAllClaims(Model model) {
		List<Claim> claims = claimService.getAllClaims();
		
		System.out.println("hello");
		claims.forEach(claim -> {
			System.out.println(claim);
		});
		model.addAttribute("claims", claims);

		return "claim";
	}
	
	
}
