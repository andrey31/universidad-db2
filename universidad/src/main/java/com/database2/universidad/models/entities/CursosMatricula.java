package com.database2.universidad.models.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * CursosMatricula
 */
@Entity
@Table(name = "cursos_matricula")
public class CursosMatricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "fk_curso")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "fk_matricula")
    @JsonIgnore
    private Matricula matricula;

    @OneToOne
    @JoinColumn(name = "fk_estado")
    private CursoEstado estado;


    public CursosMatricula() {
    }

    public CursosMatricula(int id, Curso curso, Matricula matricula, CursoEstado estado) {
        this.id = id;
        this.curso = curso;
        this.matricula = matricula;
        this.estado = estado;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Matricula getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public CursoEstado getEstado() {
        return this.estado;
    }

    public void setEstado(CursoEstado estado) {
        this.estado = estado;
    }    
}