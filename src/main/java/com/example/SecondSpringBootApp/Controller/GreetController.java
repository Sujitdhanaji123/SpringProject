package com.example.SecondSpringBootApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public String greetMsg(Model model) {
		String msg="Good Morning";
		model.addAttribute("greetMsg", msg);
		return "greet";
		
	}
}
