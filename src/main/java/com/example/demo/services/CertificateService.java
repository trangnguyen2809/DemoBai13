package com.example.demo.services;

import com.example.demo.entity.Certificate;
import org.omg.CORBA.portable.ApplicationException;

public interface CertificateService {

    Certificate getCertificateById(Integer id) throws ApplicationException;

    void addCertificate(Certificate c) throws ApplicationException;
}
