package com.example.demo.entity;

import lombok.*;

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

//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "fresher")
//    private Employee fresher;
//
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "experience")
//    private Experience experience;
//
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "intern")
//    private Intern intern;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
    private List<Certificate> certificates;
}
