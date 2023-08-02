package com.dharian.microservice.repository;

import com.dharian.microservice.entidades.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Consultas extends CrudRepository<Jugador,Integer> {

    @Query(value = "select * from players " +
            "where rol LIKE UPPER(:rol) ",nativeQuery = true)
    List<Jugador> getPlayerByRol(@Param("rol") String rol);

    @Query(value = "select * from players",nativeQuery = true)
    List<Jugador> getAllPlayers();
}
