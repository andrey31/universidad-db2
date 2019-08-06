package com.database2.universidad.models;

import com.database2.universidad.models.entities.Estudiante;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * EstudianteCrud
 */

@Repository
public interface EstudianteCrud extends CrudRepository<Estudiante, Integer>{

    
}