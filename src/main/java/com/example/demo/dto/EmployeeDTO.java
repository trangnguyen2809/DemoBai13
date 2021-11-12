package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class EmployeeDTO {
    private int id;
    private String fullName;
    private String birthday;
    private String phone;
    private String email;
    private int employee_type;
    private int employee_count;
    List<CertificateDTO> listCertificate;

    public EmployeeDTO(int id, String fullName, String birthday, String phone, String email, int employee_type, int employee_count) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.employee_type = employee_type;
        this.employee_count = employee_count;
    }
}
