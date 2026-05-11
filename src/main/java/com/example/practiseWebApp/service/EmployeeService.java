package com.example.practiseWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.practiseWebApp.model.Employee;

@Service
public class EmployeeService {
	Employee emp = new Employee();

	List<Employee> employees = new ArrayList<>( Arrays.asList(new Employee(101, "Mahi", 20),
												new Employee(102, "Ammu", 21),
												new Employee(103, "Sree", 19)));
	
	public List<Employee> getEmployee() {
		return employees;
	}

	public Employee getEmpById(int id) {
		return employees.stream()
				.filter(n -> n.getId() == id)
				.findFirst()
				.orElse(new Employee(0, "No emp", 0));
	}

	public void addEmp(Employee emp2) {
		employees.add(emp2);
	}
	
	public void updateEmp(Employee emp) {
		int index = 0;
		for (int i=0; i<employees.size(); i++) {
			if (employees.get(i).getId() == emp.getId()) {
				index = i;
			}
		}
		
		employees.set(index, emp);
	}

	public void deleteEmp(int id) {
		int index = 0;
		for (int i=0; i<employees.size(); i++) {
			if (employees.get(i).getId() == id) {
				index = i;
			}
		}
		
		employees.remove(index);
	}
	
	
}
