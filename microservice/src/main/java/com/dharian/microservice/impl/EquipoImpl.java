package com.dharian.microservice.impl;

import com.dharian.microservice.entidades.Equipo;
import com.dharian.microservice.entidades.Jugador;
import com.dharian.microservice.interfaces.IEquipo;
import com.dharian.microservice.repository.Consultas;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class EquipoImpl implements IEquipo {

   @Autowired
   Consultas consultas;

    public List<Equipo> getDataUser(String rol) {
        List<Equipo> equiposList= new ArrayList<>();
        log.info("Rol recibido: "+ rol);

        return equiposList;
    }

    @Override
    public List<Jugador> getAllUsers() {

        return consultas.getAllPlayers();
    }
}
