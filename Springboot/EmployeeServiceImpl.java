package com.spring.service;

import java.util.List;

import com.spring.dao.EmployeeDao;
import com.spring.entity.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDao dao;


    @Override
    public Employee addEmployee(Employee employee) {
        
        return dao.addEmployee(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
       
        return dao.updateEmployee(employee);
    }

    @Override
    public String deleteEmployee(int empId) {
        
        return dao.deleteEmployee(empId);
    }

    @Override
    public Employee getEmployee(int empId) {
       
        return dao.getEmployee(empId);
    }

    @Override
    public List<Employee> getallEmployee() {
        
        return dao.getallEmployee();
    }
    
}
