package com.database2.universidad.models;

import com.database2.universidad.models.entities.Distrito;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CarrerasCrud
 */
@Repository
public interface DistritoCrud extends CrudRepository<Distrito, Integer>{

    
}
