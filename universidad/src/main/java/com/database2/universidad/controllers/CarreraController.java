package com.database2.universidad.controllers;

import com.database2.universidad.models.CarreraCrud;
import com.database2.universidad.models.entities.Carrera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CarreraController
 */
@RestController
@RequestMapping("/carreras")
@CrossOrigin("*")
public class CarreraController {

    @Autowired
    private CarreraCrud carreraCrud;

    @GetMapping
    public Iterable<Carrera> findAllCarreras(){
        return carreraCrud.findAll();
    }
    
    @GetMapping("/{id}")
    public Carrera findByIdCarrera(@PathVariable("id") int id){
        return carreraCrud.findById(id).get();
    }
}