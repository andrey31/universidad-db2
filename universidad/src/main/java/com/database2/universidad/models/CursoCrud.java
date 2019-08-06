package com.database2.universidad.models;

import com.database2.universidad.models.entities.Curso;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CursoCrud
 */
@Repository
public interface CursoCrud extends CrudRepository<Curso, Integer>{

    
}