/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoIdForIdeas.ProyectoId.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Mariano
 */
@Entity
@Table(name="usuario")
@Getter
@Setter
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Date fechaDeNacimiento;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String contrasenia;

    @OneToMany(mappedBy = "usuario")
    private List<Valoracion> valoraciones;
}
