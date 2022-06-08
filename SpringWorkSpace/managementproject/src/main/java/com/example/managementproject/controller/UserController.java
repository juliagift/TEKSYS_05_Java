package com.example.managementproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.example.managementproject.entity.UserInfo;
import com.example.managementproject.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getUsers(Model model) {
		List<UserInfo> users = userService.getUsers();
		model.addAttribute("users", users);
		model.addAttribute("userInfo", new UserInfo());
		return "user";
	}

	@RequestMapping(path = "/", method = RequestMethod.POST)
	public String createUser(@ModelAttribute UserInfo userInfo) {
		userService.createUser(userInfo);
		return "redirect:/";
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public String getUser(Model model, @PathVariable("id") Integer id) throws ChangeSetPersister.NotFoundException {
		UserInfo userInfo = userService.getUser(id);
		model.addAttribute("userInfo", userInfo);
		return "edit";
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.POST)
	public RedirectView updateUser(RedirectAttributes redirectAttributes, @PathVariable("id") Integer id,
			@ModelAttribute UserInfo userInfo) throws ChangeSetPersister.NotFoundException {
		userService.updateUser(id, userInfo);
		String message = (userInfo.isActive() ? "Updated " : "Deleted ") + " user <b>" + userInfo.getFirstName() + " "
				+ userInfo.getLastName() + "</b> ✨.";
		RedirectView redirectView = new RedirectView("/", true);
		redirectAttributes.addFlashAttribute("userMessage", message);
		return redirectView;
	}

}
