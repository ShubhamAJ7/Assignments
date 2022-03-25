package com.spring.service;

import java.util.List;

import com.spring.entity.Employee;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployee(int empId);
    Employee getEmployee(int empId);
    List<Employee> getallEmployee();
    
    
}
