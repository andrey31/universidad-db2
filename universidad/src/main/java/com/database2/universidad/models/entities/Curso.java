package com.database2.universidad.models.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Cursos
 */
@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String curso;

    private int creditos;

    @OneToMany(mappedBy = "curso")
    @JsonIgnore
    private List<CursosMatricula> cursosMatricula;


    public Curso() {
    }

    public Curso(int id, String curso, int creditos, List<CursosMatricula> cursosMatricula) {
        this.id = id;
        this.curso = curso;
        this.creditos = creditos;
        this.cursosMatricula = cursosMatricula;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCreditos() {
        return this.creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public List<CursosMatricula> getCursosMatricula() {
        return this.cursosMatricula;
    }

    public void setCursosMatricula(List<CursosMatricula> cursosMatricula) {
        this.cursosMatricula = cursosMatricula;
    }
}