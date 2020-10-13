package com.javainuse.controller;

import com.javainuse.domain.Employee;
import com.javainuse.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/addNewEmployee", method = RequestMethod.GET)
    public ModelAndView show() {
        return new ModelAndView("/addEmployee.jsp", "emp", new Employee());
    }

    @RequestMapping(value = "/addNewEmployee", method = RequestMethod.POST)
    public ModelAndView processRequest(Employee emp, Errors result) {
        if (result.hasErrors()) {
            return new ModelAndView("/addEmployee.jsp", "emp", emp);
        }
        employeeService.addNewEmployee(emp);
        return new ModelAndView("/employee-added.jsp", "name", emp.getName());
    }
}