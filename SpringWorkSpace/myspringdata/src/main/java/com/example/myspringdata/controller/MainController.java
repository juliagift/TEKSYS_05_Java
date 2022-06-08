package com.example.myspringdata.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.myspringdata.entity.UserEntity;
import com.example.myspringdata.repository.UserRepository;

@Controller
@RequestMapping(path="/example")  //adds a path to the URL's start /example; can use name of website
public class MainController {
	Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired           //DI on userRepo
	private UserRepository userRepo;
	
	//localhost:8080/example/add
	@PostMapping(path="/add")  //make a post request at this url, this map is for post only
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {  //make a request to look for name and email
		UserEntity newUser = new UserEntity();  //initialize UserEntity in postmapping
		newUser.setName(name);
		newUser.setEmail(email);
		userRepo.save(newUser);
		logger.warn("Warning from post email " +email);
		logger.info("Info from post " +email +" " +name);
		
		if(logger.isDebugEnabled()) {
			logger.debug("debug from main controller: " +newUser);
		}
		
		logger.debug("from post controller");
		
		return "Saved new user";
	}
	
	//localhost:8080/example/getall
	@GetMapping(path="/getall")
	public @ResponseBody Iterable<UserEntity> getAllUsers() { //iterate over UserEntity and get everything from the entity
		logger.info("getall method");
		
		return userRepo.findAll();
	}
}
