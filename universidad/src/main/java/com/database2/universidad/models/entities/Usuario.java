package com.database2.universidad.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

/**
 * User
 */
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Size(max = 80)
    private String nombre;

    @Size(max = 80)
    private String apellido1;

    @Size(max = 80)
    private String apellido2;

    @Size(max = 80)
    private String usuario;

    @Size(max = 100)
    @JsonProperty(access = Access.WRITE_ONLY)
    private String contrasena;

    private boolean admin;



    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido1, String apellido2, String usuario, String contrasena, boolean admin) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.admin = admin;
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

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isAdmin() {
        return this.admin;
    }

    public boolean getAdmin() {
        return this.admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    
}