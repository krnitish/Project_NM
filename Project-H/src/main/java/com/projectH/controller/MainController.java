package com.projectH.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping("/w")
	public ModelAndView welcome1() {
		return new ModelAndView("welcome","msg","Welcome to Project");
	}

}
