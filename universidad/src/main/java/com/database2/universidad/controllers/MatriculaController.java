package com.database2.universidad.controllers;

import com.database2.universidad.models.MatriculaCrud;
import com.database2.universidad.models.entities.Matricula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MatriculaController
 */
@RestController
@RequestMapping("/matriculas")
@CrossOrigin("*")
public class MatriculaController {

    @Autowired
    private MatriculaCrud matriculaCrud;

    @GetMapping
    public Iterable<Matricula> findAllMatricula(){
        return matriculaCrud.findAllByOrderByIdDesc();
    }

    
}