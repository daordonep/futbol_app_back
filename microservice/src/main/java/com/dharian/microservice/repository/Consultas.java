package com.dharian.microservice.repository;

import com.dharian.microservice.entidades.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Consultas extends Repository<Jugador,Integer> {

    @Query("Select * from players" +
            "where rol LIKE UPPER(:rol) ")
    List<Jugador> getPlayerByRol(@Param("rol") String rol);
}
