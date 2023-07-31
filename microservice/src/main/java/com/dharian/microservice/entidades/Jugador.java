package com.dharian.microservice.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
public class Jugador {
    @NotNull
    private Integer id;
    private String nombre,apellido;
    private String posicion;

}
