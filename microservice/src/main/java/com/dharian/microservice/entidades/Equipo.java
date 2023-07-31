package com.dharian.microservice.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Equipo {
   private List<Jugador> equipo;
}
