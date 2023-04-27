package com.springcore.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springcore.springmvc.dto.Employee;

@Controller
public class ObjectController 
{
	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		
		//**** Sending Object Data Controller to UI ****//
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Rahul");
		employee.setSalary(8000);
		modelAndView.addObject("employee", employee);
		
		return modelAndView;
	}
	

}
