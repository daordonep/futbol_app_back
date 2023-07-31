package com.dharian.microservice.controladores;

import com.dharian.microservice.entidades.Equipo;
import com.dharian.microservice.interfaces.IEquipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServicioREST {
    @Autowired
    IEquipo iEquipo;

    @PostMapping(value="/getUserById")
    ResponseEntity<List<Equipo>> getUserById(
            @RequestParam("id") int id){

        return new ResponseEntity<>(iEquipo.getDataUser(id), HttpStatus.OK);
    }
}
