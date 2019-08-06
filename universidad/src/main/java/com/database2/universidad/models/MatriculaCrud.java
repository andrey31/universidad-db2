package com.database2.universidad.models;

import com.database2.universidad.models.entities.Matricula;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * MatriculaCrud
 */
@Repository
public interface MatriculaCrud extends CrudRepository<Matricula, Integer> {

    
}