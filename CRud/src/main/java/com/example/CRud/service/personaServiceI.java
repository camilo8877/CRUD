package com.example.CRud.service;

import com.example.CRud.domain.Persona;

import java.util.List;

public interface personaServiceI {

    public List<Persona>listarPersonas();

    public Persona guardarPersona(Persona persona);


    public Persona obtenerPersonaId(int id);

    public Persona actualizarPersona(Persona persona);

    public void eliminarpersona(int id);
}
