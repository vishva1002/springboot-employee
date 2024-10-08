package com.management.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.management.Entity.Employee;
import com.management.Service.EmployeeService;


@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    @GetMapping("/i")
    public String viewhome(Model model) {
    	model.addAttribute("employee",service.getAllEmployee());
    	return"employee-list";
    }
    @GetMapping("/new")
    public String add(Model model){
    	Employee employee=new Employee();
    	model.addAttribute(employee);
    	return "employee-form";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Employee employee) {
    	service.saveEmployee(employee);
    	return"redirect:/i";
    }
    @PutMapping("/new")
    public String Edit(@PathVariable Model model,Long id) {
    	Employee employee=service.getEmployeeId(id);
    	model.addAttribute(employee);
    	return "employee-form";
    }
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable(value="id") Long id) {
    	 service.deleteEmployee(id);
           return"redirect:/i";
    }
    
}
