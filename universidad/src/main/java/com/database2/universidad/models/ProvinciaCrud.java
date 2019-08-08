package com.database2.universidad.models;

import com.database2.universidad.models.entities.Provincia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CursoCrud
 */
@Repository
public interface ProvinciaCrud extends CrudRepository<Provincia, Integer>{

    
}