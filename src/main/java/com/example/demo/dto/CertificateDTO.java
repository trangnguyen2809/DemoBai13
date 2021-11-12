package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class CertificateDTO {
    private int certificatedID;
    private String certificateName;
    private String certificateRank;
    private Date certificatedDate;
//    private EmployeeDTO employee;
    private int empoloyee_id;

    public CertificateDTO(int certificatedID, String certificateName, String certificateRank, Date certificatedDate, int employee_id) {
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificatedDate = certificatedDate;
        this.empoloyee_id = employee_id;
    }
}
