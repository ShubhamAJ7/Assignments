package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
//import javax.print.attribute.standard.PrinterMessageFromOperator;

import com.spring.entity.Employee;

import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @PersistenceContext
    EntityManager entity;


    @Override
    public Employee addEmployee(Employee employee) {
        entity.persist(employee);
        return entity.find(Employee.class,employee.getEmpId());
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return entity.merge(employee);
    }

    @Override
    public String deleteEmployee(int empId) {
        Employee emp=entity.find(Employee.class,empId);
        if(emp!=null)
        {
              entity.remove(emp);
              return "done";
        }
        else{
            return "not found";
        }
        
        
       
    }

    @Override
    public Employee getEmployee(int empId) {
        Employee emp = entity.find(Employee.class, empId);
		return emp;
    }

    @Override
    public List<Employee> getallEmployee() {
        TypedQuery<Employee> q2 = entity.createQuery("select c from Employee c", Employee.class);
		List<Employee> l1 = q2.getResultList();
		return l1;
    }
    
}
