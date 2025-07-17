package com.shankrish.crudmssqlemployee.service;

import com.shankrish.crudmssqlemployee.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Integer id, Employee employeeInfo);
    String deleteEmployee(Integer id);
}
