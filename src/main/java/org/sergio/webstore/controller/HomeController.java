package org.sergio.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping //("/welcome")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Добро пожаловать в Web магазин!");
		model.addAttribute("tagline", "The one and only amazing web store");

		return "welcome";
	}
}
