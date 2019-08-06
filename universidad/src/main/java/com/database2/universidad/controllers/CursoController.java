package com.database2.universidad.controllers;

import com.database2.universidad.models.CursoCrud;
import com.database2.universidad.models.entities.Curso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CursoController
 */
@RestController
@RequestMapping("/cursos")
@CrossOrigin("*")
public class CursoController {

    @Autowired
    private CursoCrud cursoCrud;

    @GetMapping
    public Iterable<Curso> findAllCurso(){
        return cursoCrud.findAll();
    }
    
}