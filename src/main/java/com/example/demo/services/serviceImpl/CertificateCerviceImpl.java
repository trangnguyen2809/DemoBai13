package com.example.demo.services.serviceImpl;

import com.example.demo.entity.Certificate;
import com.example.demo.repository.CertificateRepository;
import com.example.demo.services.CertificateService;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificateCerviceImpl implements CertificateService {

    @Autowired
    CertificateRepository certificateRepository;

    @Override
    public Certificate getCertificateById(Integer id) throws ApplicationException {
        Certificate c = certificateRepository.getCertificateById(id);
        return c;
    }

    @Override
    public void addCertificate(Certificate c) throws ApplicationException {

    }
}
