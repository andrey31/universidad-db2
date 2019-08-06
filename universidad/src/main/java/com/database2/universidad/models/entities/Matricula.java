package com.database2.universidad.models.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Matricula
 */
@Entity
@Table(name = "matriculas")
public class Matricula {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    private String cuatrimestre;

    private String ano;

    @ManyToOne
    @JoinColumn(name = "fk_estudiante")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "fk_usuario")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    private Usuario usuario;

    @OneToMany(mappedBy = "matricula")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    private List<CursosMatricula> cursosMatricula;

    @OneToOne(mappedBy = "matricula")
    private Pago pago;

    public Matricula() {
    }

    public Matricula(int id, String cuatrimestre, String ano, Estudiante estudiante, Usuario usuario, List<CursosMatricula> cursosMatricula, Pago pago) {
        this.id = id;
        this.cuatrimestre = cuatrimestre;
        this.ano = ano;
        this.estudiante = estudiante;
        this.usuario = usuario;
        this.cursosMatricula = cursosMatricula;
        this.pago = pago;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCuatrimestre() {
        return this.cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Estudiante getEstudiante() {
        return this.estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<CursosMatricula> getCursosMatricula() {
        return this.cursosMatricula;
    }

    public void setCursosMatricula(List<CursosMatricula> cursosMatricula) {
        this.cursosMatricula = cursosMatricula;
    }

    public Pago getPago() {
        return this.pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}