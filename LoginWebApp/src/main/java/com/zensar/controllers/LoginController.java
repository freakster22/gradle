package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zensar.entities.User;
import com.zensar.services.UserService;
/**
 * @author Arib Anwar
 * @creationDate: 11th Oct 2019 15:40
 * @version:1.0
 * @description:This is a User Class.
 * 				This is Request Processor.Like POJO
 *				Using Service Annotation
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@RequestMapping("login")
	@PostMapping
	public String checkLogin(User user, ModelMap map) {
		if (userService.validateUser(user)){
			map.addAttribute("userNm",user.getUsername());//key value data to store
			return "welcome";} //This is Logical View Name.
		else map.addAttribute("Login Error", "Invalid Username or Password.");
			return "login";
		}
}

