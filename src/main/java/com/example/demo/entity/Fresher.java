package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fresher")
public class Fresher implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Employee employee;
//
//    @JoinColumn(name = "employee_id", nullable = false)
//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "fresher")
//    private Employee employee;

    @Column(name = "graduation_date")
    private Date graduation_date;

    @Column(name = "graduation_rank")
    private String graduation_rank;

    @Column(name = "education")
    private String education;
}
