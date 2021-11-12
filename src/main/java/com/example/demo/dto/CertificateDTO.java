package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificateDTO {
    private int certificatedID;
    private String certificateName;
    private String certificateRank;
    private Date certificatedDate;
    private EmployeeDTO employee;
    private int empolyee_id;
    private String employee_name;

    public CertificateDTO(int certificatedID, String certificateName, String certificateRank, Date certificatedDate, int employee_id) {
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
        this.empolyee_id = employee_id;
    }
    public CertificateDTO(int certificatedID, String certificateName, String certificateRank, Date certificatedDate, String employee_name) {
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
        this.employee_name = employee_name;
    }
}
