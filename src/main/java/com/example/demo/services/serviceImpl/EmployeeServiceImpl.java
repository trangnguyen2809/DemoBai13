package com.example.demo.services.serviceImpl;

import com.example.demo.dto.CertificateDTO;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.repository.CertificateRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.services.EmployeeService;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final CertificateRepository certificateRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, CertificateRepository certificateRepository) {
        this.employeeRepository = employeeRepository;
        this.certificateRepository = certificateRepository;
    }


    @Override
    public EmployeeDTO getEmployeeById(Integer id) throws ApplicationException {
//        Employee employee = employeeRepository.getEmployeeById(id);
        EmployeeDTO employee = employeeRepository.getCertificateByEmployee(id);
        List<CertificateDTO> certificateDTOList = certificateRepository.getListCertificateByEmployeeId(id);
        employee.setListCertificate(certificateDTOList);
        return employee;
    }
}
