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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Estudiante
 */
@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size( max = 80 )
    private String nombre;

    @Size(max = 80)
    private String apellido1;

    @Size(max = 80)
    private String apellido2;

    @Size(max = 80)
    private String telefono;

    @Size(max = 80)
    private String correo;

    private boolean regular;

    @ManyToOne
    @JoinColumn(name = "fk_carrera")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "carrera")
    @JsonIdentityReference(alwaysAsId = true)
    private Carrera carrera;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_direccion")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    private Direccion direccion;


    public Estudiante() {
    }

    public Estudiante(int id, String nombre, String apellido1, String apellido2, String telefono, String correo, boolean regular, Carrera carrera, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.correo = correo;
        this.regular = regular;
        this.carrera = carrera;
        this.direccion = direccion;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return this.apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return this.apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isRegular() {
        return this.regular;
    }

    public boolean getRegular() {
        return this.regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public Carrera getCarrera() {
        return this.carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}