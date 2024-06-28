package com.example.SecondSpringBootApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WishController {

	@GetMapping("/message")
	public String WelcomeMsg(Model model) {
		String msg = "Welcome to Bikkad IT";
		
		model.addAttribute("Message", msg);
		return "Welcome";
	}
}
