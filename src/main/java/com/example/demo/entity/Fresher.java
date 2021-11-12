package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

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

//    @OneToOne
//    private Employee employee;

    @Column(name = "graduation_date")
    private Date graduation_date;

    @Column(name = "graduation_rank")
    private String graduation_rank;

    @Column(name = "education")
    private String education;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "employee_id", referencedColumnName = "id")
//    private Employee employee;

//    @OneToOne
//    @MapsId
//    @JoinColumn(name = "employee_id")
//    private Employee employee;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

}
