package com.javainuse.service;

import com.javainuse.domain.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void addNewEmployee(Employee employee);
}
