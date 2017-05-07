package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.hello.model.User;
@Controller
@RequestMapping("/form")
public class Formtest {
	@RequestMapping("/user")
	public ModelAndView helloWorld() {

		return new ModelAndView("formtest", "command", new User());
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("SpringWeb")User user, 
			   ModelMap model) {
		model.addAttribute("id",user.getId());
		model.addAttribute("name",user.getName());
		return "result";
	}
}
