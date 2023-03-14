package com.example.CRud.service;

import com.example.CRud.domain.Persona;
import com.example.CRud.repository.IEstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class personaService implements personaServiceI{

        @Autowired
        private IEstudianteRepository repositorio;


    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) repositorio.findAll();
    }

    @Override
    public Persona guardarPersona(Persona persona) {
        return repositorio.save(persona);
    }

    @Override
    public Persona obtenerPersonaId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Persona actualizarPersona(Persona persona) {
       return repositorio.save(persona);
    }

    @Override
    public void eliminarpersona(int id) {
        repositorio.deleteById(id);

    }
}
