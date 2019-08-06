package com.database2.universidad.models;

import com.database2.universidad.models.entities.Carrera;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CarrerasCrud
 */
@Repository
public interface CarreraCrud extends CrudRepository<Carrera, Integer>{

    
}