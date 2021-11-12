package com.example.demo.controller;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.services.EmployeeService;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getEmployeeById/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Integer id) throws ApplicationException {
        EmployeeDTO c = employeeService.getEmployeeById(id);
        return c;
    }
}
