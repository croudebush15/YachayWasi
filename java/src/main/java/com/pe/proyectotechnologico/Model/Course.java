package com.pe.proyectotechnologico.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")
public class Course {
        @Id
        @GeneratedValue(strategy = IDENTITY)
        @Column(name = "idCourse", unique = true, nullable = false)
        private String idCourse;
        private String name;
        private String description;
}
