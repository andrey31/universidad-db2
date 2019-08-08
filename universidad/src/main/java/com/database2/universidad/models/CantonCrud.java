package com.database2.universidad.models;

import com.database2.universidad.models.entities.Canton;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * CursoCrud
 */
@Repository
public interface CantonCrud extends CrudRepository<Canton, Integer>{

    
}