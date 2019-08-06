package com.database2.universidad.models.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * Carrera
 */
@Entity
@Table(name = "carreras")
public class Carrera {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Size(max = 100)
    private String carrera;

    @OneToMany(mappedBy = "carrera")
    @JsonProperty(access = Access.WRITE_ONLY)
    private List<Estudiante> estudiante;
    
    @OneToMany(mappedBy = "carrera")
    private List<CursosCarrera> cursosCarreras;


    public Carrera() {
    }

    public Carrera(int id, String carrera, List<Estudiante> estudiante, List<CursosCarrera> cursosCarreras) {
        this.id = id;
        this.carrera = carrera;
        this.estudiante = estudiante;
        this.cursosCarreras = cursosCarreras;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarrera() {
        return this.carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Estudiante> getEstudiante() {
        return this.estudiante;
    }

    public void setEstudiante(List<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }

    public List<CursosCarrera> getCursosCarreras() {
        return this.cursosCarreras;
    }

    public void setCursosCarreras(List<CursosCarrera> cursosCarreras) {
        this.cursosCarreras = cursosCarreras;
    }
}