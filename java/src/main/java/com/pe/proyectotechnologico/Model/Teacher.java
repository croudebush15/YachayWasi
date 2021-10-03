package com.pe.proyectotechnologico.Model;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;



@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "teacher", uniqueConstraints = @UniqueConstraint(columnNames = "DNI"))
public class Teacher implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idTeacher", unique = true, nullable = false)
    private Integer idTeacher;
    private String name;
    private String lastName;
    private String DNI;
    private Date birthDate;
    private String cellphone;
    private String email;
    private String address;
    private Boolean Status;


}
