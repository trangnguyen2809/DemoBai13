package com.example.demo.services;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.Employee;
import org.omg.CORBA.portable.ApplicationException;

public interface EmployeeService {
    EmployeeDTO getEmployeeById(Integer id) throws ApplicationException;
}
