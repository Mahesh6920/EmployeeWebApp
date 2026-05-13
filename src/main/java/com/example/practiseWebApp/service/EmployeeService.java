package com.example.practiseWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practiseWebApp.Repository.EmployeeRepo;
import com.example.practiseWebApp.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public List<Employee> getEmployee() {
		return repo.findAll();
	}

	public Employee getEmpById(int id) {
		return repo.findById(id).orElse(new Employee());
	}

	public void addEmp(Employee emp2) {
		repo.save(emp2);
	}
	
	public void updateEmp(Employee emp) {
		repo.save(emp);
	}

	public void deleteEmp(int id) {
		repo.deleteById(id);
	}
	
	
}
