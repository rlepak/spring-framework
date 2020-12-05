package com.application.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@GetMapping
	public String login(){
		return "login";
	}

	@RequestMapping("/welcome")
	public String homePage(){
		return "/welcome";
	}

}
