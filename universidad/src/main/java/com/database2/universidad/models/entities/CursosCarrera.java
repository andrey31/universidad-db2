package com.database2.universidad.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * CursosCarrera
 */
@Entity
@Table(name = "cursos_carrera")
public class CursosCarrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int cuatrimestre;

    @ManyToOne
    @JoinColumn(name = "fk_curso")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "fk_carrera")
    @JsonIgnore
    private Carrera carrera;


    public CursosCarrera() {
    }

    public CursosCarrera(int id, int cuatrimestre, Curso curso, Carrera carrera) {
        this.id = id;
        this.cuatrimestre = cuatrimestre;
        this.curso = curso;
        this.carrera = carrera;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCuatrimestre() {
        return this.cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Carrera getCarrera() {
        return this.carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }    
}