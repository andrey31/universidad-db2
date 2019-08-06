package com.database2.universidad.controllers;

import com.database2.universidad.models.EstudianteCrud;
import com.database2.universidad.models.entities.Estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * EstudianteController
 */
@RestController
@RequestMapping("/estudiantes")
@CrossOrigin("*")
public class EstudianteController {

    @Autowired
    private EstudianteCrud estudianteCrud;

    @GetMapping
    public Iterable<Estudiante> findAllEstudiante(){
        return estudianteCrud.findAll();
    }
    @PutMapping({"/{id}"})
    public Estudiante deleteEstudiante(@PathVariable int id, @RequestBody Estudiante estudiante){
        Estudiante estudiante2 = estudianteCrud.findById(id).get();

        estudiante2.setNombre(estudiante.getNombre());
        estudiante2.setApellido1(estudiante.getApellido1());
        estudiante2.setApellido2(estudiante.getApellido2());
        /* estudiante2.setCarrera(estudiante.getCarrera()); */
        estudiante.setCorreo(estudiante.getCorreo());
        estudiante.setDireccion(estudiante.getDireccion());
        estudiante.setRegular(estudiante.getRegular());
        estudiante.setTelefono(estudiante.getTelefono());
        return estudianteCrud.save(estudiante2);
    }
}