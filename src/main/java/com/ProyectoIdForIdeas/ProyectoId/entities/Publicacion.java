/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoIdForIdeas.ProyectoId.entities;

import lombok.Getter;
import lombok.Setter;

import java.awt.Image;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Mariano
 */
@Entity
@Table(name="publicacion")
@Getter
@Setter
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false)
    private int cantidadLikes;

    @Column(nullable = false)
    private String descripcion;
    @Column(nullable = false)
    private String imagen;
    @OneToMany(mappedBy = "publicacion")
    private List<Valoracion> valoraciones;

}
