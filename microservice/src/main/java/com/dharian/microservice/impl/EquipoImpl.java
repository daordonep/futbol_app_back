package com.dharian.microservice.impl;

import com.dharian.microservice.entidades.Equipo;
import com.dharian.microservice.entidades.Jugador;
import com.dharian.microservice.interfaces.IEquipo;
import com.dharian.microservice.repository.Consultas;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class EquipoImpl implements IEquipo {

   @Autowired
   Consultas consultas;
    @Override
    public List<Jugador> getUserByRol(String rol) {
        log.info("Rol recibido: "+ rol);

        return consultas.getPlayerByRol(rol);
    }

    @Override
    public List<Jugador> getAllUsers() {

        return consultas.getAllPlayers();
    }

    @Override
    public List<Equipo> generateTeams() {

        return null;
    }
}
