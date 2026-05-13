package com.example.practiseWebApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practiseWebApp.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
