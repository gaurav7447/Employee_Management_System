package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.company.model.Employee;
import com.company.service.DepartmentService;
import com.company.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	
	private EmployeeService employeeservice;
	@Autowired
	private DepartmentService departmentservice;
	@GetMapping("/allemployee")
	public String getAllEmployee(Model model) {
		
		model.addAttribute("Employee",employeeservice.getAllEmplayee());
		return "View_Employee";
		
		}
	@GetMapping("/newemployee")
	public String newEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee",employee);
		model.addAttribute("departments",departmentservice.getAllDepartment());
		
			return "New_Employee";
		
	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeservice.saveEmployee(employee);
		return "redirect:/allemployee";
	}

}
