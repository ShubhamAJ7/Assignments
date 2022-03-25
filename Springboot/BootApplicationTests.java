package com.spring.boot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.spring.entity.Employee;
import com.spring.service.EmployeeService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootApplicationTests {

@Autowired
EmployeeService service;

	@Test
    void testAddEmployee() {
		
		Employee employee=new Employee(111, "mehul", 1520, "jaipur");		
		Employee emp=service.addEmployee(employee);
//		
		assertEquals(emp.getEname(),"mehul");
	}


//	@Test
//	void testUpdateEmployee() {
//		
//		Employee employee=new Employee(111, "sathya", 1520, "jaipur");
//		
//		Employee emp=service.updateEmployee(employee);
//		
//		assertEquals(emp.getEmpName(),"sruthi");
//	}


//	@Test
//	void testDeleteEmployee() {
//		
//		String emp=service.deleteEmployee(111);
//		assertEquals(emp,"employee deleted");
//	}


}
