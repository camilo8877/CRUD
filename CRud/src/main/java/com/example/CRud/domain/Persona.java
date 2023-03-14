package com.example.CRud.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="contactos")

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")

    private int id;


    @Column(name = "nombre")

    private String nombre;
    @Column(name = "correo", unique = true)

    private String correo;

    @Column(name = "fecha_nacimiento")

    private String fecha_nacimiento;

    @Column(name = "telefono")
    private int telefono;


    public Persona(){

    }

    public Persona(String nombre, String correo, String fecha_nacimiento, int telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
