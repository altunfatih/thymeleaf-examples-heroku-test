package com.fatih.thymleafExamples._00_helloThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("hello")
	public String renderHello(Model model) {
		model.addAttribute("welcome_message", "Merhaba Arkadaşlar");
		
		return "hello";
	}
	
}
