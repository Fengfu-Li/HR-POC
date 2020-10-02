package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public Employee insertStudent(@RequestBody Employee employee) {
		
		repository.save(employee);
		
		return employee;
	}
	
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Employee> viewAll() {
		
		return repository.findAll();
	}

}
