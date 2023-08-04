package com.dharian.microservice.interfaces;

import com.dharian.microservice.entidades.Equipo;
import com.dharian.microservice.entidades.Jugador;

import java.util.List;

public interface IEquipo {
     /**
      *
      * @param rol se consulta el user por este campo
      * @return una lista con los jugadores por rol.
      */
     List<Jugador> getUserByRol(String rol);

     /**
      *
      * @return Lista de todos los jugadores.
      */
     List<Jugador> getAllUsers();

     /**
      * Genera los equipos por roles
      * @return una lista de dos equipos formado por 3 defensas, 3 medios y 1 delantero.
      */
     List<Equipo> generateTeams();

}
