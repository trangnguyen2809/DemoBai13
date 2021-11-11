package com.example.demo.services.serviceImpl;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.services.EmployeeService;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee getEmployeeById(Integer id) throws ApplicationException {
        Employee employee = employeeRepository.getEmployeeById(id);
        return employee;
    }
}
