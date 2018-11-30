package com.ope.data.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ope.data.entity.User;

@Controller
@RequestMapping()
public class HelloWorldController {
	@GetMapping("/index/{name}")
	public String getPage(@PathVariable("name")String name,HttpServletRequest req) {
		User user = new User();
		user.setName(name);		
		req.setAttribute("user", user);
		return "index";
	}
}
