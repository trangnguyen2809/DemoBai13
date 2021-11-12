package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "employee_type")
    private int employee_type;

    @Column(name = "employee_count")
    private int employee_count;

    //    @PrimaryKeyJoinColumn
//    @JoinColumn(name = "employee_id", nullable = false)

    @OneToOne(cascade = CascadeType.ALL, optional = false, mappedBy = "employee")
    private Fresher fresher;

//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "employee")
//    @JoinColumn(name = "employee_id", nullable = false)
//    private Experience experience;
//
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "employee")
//    @JoinColumn(name = "employee_id", nullable = false)
//    private Intern intern;

    @OneToOne(mappedBy = "employee")
    private Experience experience;

    @OneToOne(mappedBy = "employee")
    private Intern intern;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
    @JsonIgnore
    private List<Certificate> certificates;
}
