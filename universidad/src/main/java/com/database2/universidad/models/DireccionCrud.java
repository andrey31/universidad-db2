package com.database2.universidad.models;

import com.database2.universidad.models.entities.Direccion;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CursoCrud
 */
@Repository
public interface DireccionCrud extends CrudRepository<Direccion, Integer>{

    
}