package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hello.dao.UserDao;
import com.hello.dao.UserMapper;
import com.hello.model.User;

@Controller
public class helloworld {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
	
	@RequestMapping("/data")
	public ModelAndView hello(){
		UserMapper userdao = new UserDao();
		User user = userdao.selectByPrimaryKey(1);
		
		return new ModelAndView("welcome", "user", user);
	}
}

