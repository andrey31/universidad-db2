package com.database2.universidad.models;

import com.database2.universidad.models.entities.Usuario;

import org.springframework.data.repository.CrudRepository;

/**
 * UsuarioCrud
 */
public interface UsuarioCrud extends CrudRepository<Usuario, Integer> {

    public Usuario findByUsuario(String nombre);
    public Iterable<Usuario> findByAdmin(boolean admin);
}