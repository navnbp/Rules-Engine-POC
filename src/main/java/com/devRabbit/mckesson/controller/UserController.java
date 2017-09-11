package com.devRabbit.mckesson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.devRabbit.mckesson.model.User;
import com.devRabbit.mckesson.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model)
	{
		model.addAttribute("login", new User());
		return "login/login";
	}
	
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validateUser(final User user) {
		
		if(userService.validateUser(user))
			return "SUCCESS";
		return "FAILED";
	}
}
