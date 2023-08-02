package com.dharian.microservice.interfaces;

import com.dharian.microservice.entidades.Equipo;
import com.dharian.microservice.entidades.Jugador;

import java.util.List;

public interface IEquipo {
     /**
      *
      * @param rol se consulta el user por este campo
      * @return una lista con los equipos hechos por rol.
      */
     List<Equipo> getDataUser(String rol);

     /**
      *
      * @return Lista de todos los jugadores.
      */
     List<Jugador> getAllUsers();

}
