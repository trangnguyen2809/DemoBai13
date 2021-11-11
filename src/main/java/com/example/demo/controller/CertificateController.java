package com.example.demo.controller;

import com.example.demo.entity.Certificate;
import com.example.demo.services.CertificateService;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/certificate")
public class CertificateController {
    @Autowired
    CertificateService certificateService;

    @GetMapping("/getCertificateById/{id}")
    public Certificate getCertificateById(@PathVariable Integer id) throws ApplicationException {
        Certificate c = certificateService.getCertificateById(id);
        return c;
    }
}
