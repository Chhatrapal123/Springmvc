package com.springcore.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springcore.springmvc.dto.User;

@Controller
public class UserController 
{
	// Sending Data UI to Controller //
	
	//**** String for ModelMap And String View ****//
	@RequestMapping("/registrationPage")
	public String showRegistrationPage()
	{	
		return "userReg";		
	}
	
	//**** String for ModelMap And String View ****//
	@RequestMapping(value = "registerUser", method = {RequestMethod.GET, RequestMethod.POST})
	public String registerUser(@ModelAttribute("user")User user,Model model)
	{
		System.out.println(user);  
		model.addAttribute("user",user);
		return "regResult";
		
	}

	//**** First Controller Method ****//
	
//	public ModelAndView showRegistrationPage()
//	{
//		ModelAndView modelAndView = new ModelAndView();
//		
//		modelAndView.setViewName("userReg");
//		return modelAndView;		
//	}
	
	//**** Second Controller method ****//
	
//	@RequestMapping(value = "registerUser", method = {RequestMethod.GET, RequestMethod.POST})
//	public ModelAndView registerUser(@ModelAttribute("user")User user)
//	{
//		System.out.println(user);  
//		ModelAndView modelAndView = new ModelAndView();
//		
//		modelAndView.addObject("user", user);
//		modelAndView.setViewName("regResult");
//		return modelAndView;
//		
//	}

}
