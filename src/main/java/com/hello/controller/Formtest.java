package com.hello.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hello.dao.SchoolDao;
import com.hello.dao.SchoolMapper;
import com.hello.dao.UserDao;
import com.hello.dao.UserMapper;
import com.hello.model.School;
import com.hello.model.User;

@Controller
@RequestMapping("/form")
public class Formtest {
	@RequestMapping("/user")
	public ModelAndView helloWorld() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("command", new User());
		mv.setViewName("formtest");
		return mv;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("SpringWeb") User user, ModelMap model) {
		UserMapper userdao = new UserDao();
		if(user.getId()==null){
			model.addAttribute("id", user.getId());
			model.addAttribute("name", user.getName());
			model.addAttribute("school", user.getSchool());
			model.addAttribute("enable", user.getEnable());
			Integer userAdd = userdao.insert(user);
		}else{
			model.addAttribute("id", user.getId());
			model.addAttribute("name", user.getName());
			model.addAttribute("school", user.getSchool());
			model.addAttribute("enable", user.getEnable());
			Integer userUpdate = userdao.updateByPrimaryKeySelective(user);
		}
		
		return "redirect:result";
	}

	@RequestMapping(value = "/del")
	public String del(Integer id) {
		if(id!=0){
			UserMapper userdao = new UserDao();
			Integer userDelete = userdao.deleteByPrimaryKey(id);
			return "redirect:result";
		}else{
			return "redirect:result";
		}
	}
	
	@RequestMapping(value = "/result")
	public ModelAndView result() {
		UserMapper userdao = new UserDao();
		List<User> userList = userdao.getUserList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("userList", userList);
		mv.addObject("command", new User());
		mv.setViewName("result");
		return mv;
	}

	@ModelAttribute("schoolList")
	public Map<String, String> getschoolList() {
		Map<String, String> schoolList = new HashMap<String, String>();
		SchoolMapper schooldao = new SchoolDao();
		List<School> school = schooldao.getSchoolList();
		for (School s : school) {
			schoolList.put(s.getId().toString(), s.getSchool().toString());
		}
		return schoolList;
	}
}
