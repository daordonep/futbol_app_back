package com.dharian.microservice.interfaces;

import com.dharian.microservice.entidades.Equipo;

import java.util.List;

public interface IEquipo {
     /**
      * Se usa para obtener los datos de un usuario filtrado por ID.
      * @param id se consulta el user por este campo
      * @return una lista con los equipos hechos por rol.
      */
     List<Equipo> getDataUser(int id);

}
