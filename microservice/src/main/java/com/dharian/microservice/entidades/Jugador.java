package com.dharian.microservice.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "players")
public class Jugador {

    @Id
    @Column(name="id", nullable= false)
    private Integer id;
    @Column(name="name", nullable = false)
    private String nombre;
    @Column(name= "surname", nullable = false)
    private String apellido;
    @Column(name="rol",nullable= false )
    private String posicion;

}
