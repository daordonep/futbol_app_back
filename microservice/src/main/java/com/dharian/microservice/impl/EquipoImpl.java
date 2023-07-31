package com.dharian.microservice.impl;

import com.dharian.microservice.entidades.Equipo;
import com.dharian.microservice.interfaces.IEquipo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EquipoImpl implements IEquipo {

    public List<Equipo> getDataUser(int id) {
        List<Equipo> equiposList= new ArrayList<>();


        return equiposList;
    }
}
