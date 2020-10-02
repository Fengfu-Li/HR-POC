package com.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;

@SpringBootTest
class SpringbootDatajpaApplicationTests {

	@Autowired
	private EmployeeRepository repository;
	
	@Test
	public void createStudent() {
		Employee employee = new Employee();
		employee.setId(10);
		employee.setName("Robert Miles");
		employee.setScore(98);
		
		repository.save(employee);
		
		Employee createdStudent = repository.findById(10).get();
		assertNotNull(createdStudent);
	}

}
