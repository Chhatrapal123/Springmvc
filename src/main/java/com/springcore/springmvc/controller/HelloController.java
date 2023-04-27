package com.springcore.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController 
{
	@RequestMapping("/hello")
	public ModelAndView hello()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		
		// object type (Controller to UI)
//		String msg = "Let's Learn JAVA";
//		modelAndView.addObject("MSG", msg);
		
		// Sending Premitive type(Controller to UI)
		modelAndView.addObject("id", 123);
		modelAndView.addObject("name","Ankit" );
		modelAndView.addObject("salary",10000 );
		return  modelAndView;
	}

}
