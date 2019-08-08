package com.database2.universidad.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * CursoEstado
 */
@Entity
@Table(name = "curso_estado")
public class CursoEstado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size( max = 40)
    private String estado;

    public CursoEstado() {
    }

    public CursoEstado(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}