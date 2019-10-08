package com.codingmonk.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingmonk.pojo.User;
import com.codingmonk.services.UserServices;

@Controller
public class UserController {

	@Autowired
	UserServices userServices;
	
	@RequestMapping("/user")
	public String user(Model model) {
		Optional<User> optional = userServices.getUser(10);
		if(optional.isPresent()) {
			model.addAttribute(optional.get());
		}else {
			User user = new User();
			user.setId(20);
			user.setName("monk");
			user.setEmmission(100.00F);
			user.setSource("car");
			model.addAttribute(user);
		}
		
		return "userView";
	}
	
	/*
	 * @RequestMapping("/addUser") public String addUser(User user) {
	 * userServices.save(user); return "user.html"; }
	 */
	
	
	@RequestMapping("/")
	public String entry() {
		return "home.jsp";
	}
}
