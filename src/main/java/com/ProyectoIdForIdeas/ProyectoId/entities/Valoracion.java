/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoIdForIdeas.ProyectoId.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 *
 * @author Mariano
 */
@Entity
@Table(name="valoracion")
@Getter
@Setter
public class Valoracion {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false)
    private Valor valor;
    @ManyToOne
    private Publicacion publicacion;
    @ManyToOne
    private Usuario usuario;

}
