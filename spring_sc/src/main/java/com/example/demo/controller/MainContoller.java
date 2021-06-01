package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainContoller {

	@GetMapping("/")
	public ModelAndView Home() {
		return new ModelAndView("Home");
	}
	
	@GetMapping("/hello")
	public ModelAndView Hello() {
		return new ModelAndView("Hello");
	}
	
	@RequestMapping("/hellouser")
	public String hellouser() 
	{
		return "hellouser";		
	}
	@RequestMapping("/login")
	public String login() 
	{
		return "login";		
	}
//	@RequestMapping("/403")
//	public String accessdenied() 
//	{
//		return "403";		
//	}
}
