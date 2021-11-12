package com.example.demo.repository;

import com.example.demo.dto.CertificateDTO;
import com.example.demo.entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Integer> {
    @Query("SELECT c FROM Certificate c WHERE c.id = :id")
    Certificate getCertificateById(@Param("id") Integer id);

    @Query("SELECT new com.example.demo.dto.CertificateDTO(c.id, c.certificateName, c.certificateRank, c.certificatedDate, c.employee.id) FROM Certificate c WHERE c.employee.id = :id")
    List<CertificateDTO> getListCertificateByEmployeeId(@Param("id") Integer id);
}
