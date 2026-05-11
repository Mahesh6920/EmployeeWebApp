package com.example.practiseWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practiseWebApp.model.Employee;
import com.example.practiseWebApp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@GetMapping("/emps")
	public List<Employee> employees() {
		return service.getEmployee();
	}
	
	@GetMapping("/emp/{id}")
	public Employee getEmpById(@PathVariable int id) {
		return service.getEmpById(id);
	}
	
	@PostMapping("/emp")
	public void addEmp(@RequestBody Employee emp) {
		service.addEmp(emp);
	}
	
	@PutMapping("/emp")
	public void updateEmp(@RequestBody Employee emp) {
		service.updateEmp(emp);
	}
	
	@DeleteMapping("/emp/{id}")
	public void deleteEmp(@PathVariable int id) {
		service.deleteEmp(id);
	}
	
}
