package com.springcore.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springcore.springmvc.dto.Employee;

@Controller
public class ListController 
{
	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Rahul");
		employee.setSalary(8000);

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Sanket");
		employee2.setSalary(10000);
		
		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("Punam");
		employee3.setSalary(7000);
		
		Employee employee4 = new Employee();
		employee4.setId(4);
		employee4.setName("Aakruti");
		employee4.setSalary(12000);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		modelAndView.addObject("employees", employees);
		
		
		return modelAndView;
	}
	

}
