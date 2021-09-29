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
@Table(name = "material")
public class Material {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idMaterial", unique = true, nullable = false)
    private String idMaterial;
    private String route;
    private String description;
    private Date uploadDate;

    //Relacion con Idcurso

}
