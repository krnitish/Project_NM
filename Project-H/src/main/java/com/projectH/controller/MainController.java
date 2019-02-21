package com.projectH.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.projectH.dao.RegisterDao;
import com.projectH.model.Users;

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
	@RequestMapping("/userreg")
	public ModelAndView register()
	{
		return new ModelAndView("registeruser","command",new Users());
	}
	@RequestMapping(value="/addnewuser" ,method=RequestMethod.POST)
	public ModelAndView regnewuser(@RequestBody Users user,ModelAndView modelAndView)
	{
		new RegisterDao().saveNewUser(user);
		
		return new ModelAndView("welcome","msg","Welcome to Project");
	}
}
