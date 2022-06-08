package com.example.thymeleaftour.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
//	 method will be invoked when http://localhost:8080/showflowerList is accessed.
	@GetMapping("/showflowerList")
	   public String sendDataToHtml(Model model) {
	       String[] flowers = new String[] {"Rose", "Lily", "Tulip", "Carnation", "Hyacinth"};
	       String[] City = new String[] {"nyc", "nj", "dallas", "chicago", "philadelphia"};
	       model.addAttribute("flowersVariable", flowers);
	       model.addAttribute("CityVariable", City);
	       return "viewFlowers";
	   }

}
