package com.pe.proyectotechnologico.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student", uniqueConstraints = @UniqueConstraint(columnNames = "DNI"))
public class Student implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idStudent", unique = true, nullable = false)
    private Integer idStudent;
    private String name;
    private String lastName;
    private String DNI;
    private Date birthDate;
    private String cellphone;
    private String email;
    private String address;
    private Boolean status;


}
