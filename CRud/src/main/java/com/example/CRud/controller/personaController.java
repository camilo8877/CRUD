package com.example.CRud.controller;



import com.example.CRud.domain.Persona;
import com.example.CRud.service.personaServiceI;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j

public class personaController {

    @Autowired

    private personaServiceI servicio ;

    @GetMapping({"/persona","/"})
    public String listarPersonas(Model modelo){
        List<Persona> persona = servicio.listarPersonas();
        modelo.addAttribute("persona", persona);
        return "persona";
    }


    @GetMapping("/persona/nuevo")
    public String crearPersonaFormulario(Model modelo){
        Persona persona = new Persona();
        modelo.addAttribute("persona", persona);
        return "crear_Persona";

    }

    @PostMapping("/persona")
    public String guardarPersona(@ModelAttribute("persona")Persona persona){
        servicio.guardarPersona(persona);
        return "redirect:/persona";

    }

    @GetMapping("/persona/editar/{id}")
    public String mostrarFormEditar(@PathVariable int id, Model modelo){
        modelo.addAttribute("persona", servicio.obtenerPersonaId(id));
        return "editar_persona";

    }

    @PostMapping("/persona/{id}")
    public String actualizarPersona(@PathVariable int id, @ModelAttribute("persona")Persona persona, Model modelo){
        Persona personaExistente = servicio.obtenerPersonaId(id);
        personaExistente.setId(id);
        personaExistente.setNombre(persona.getNombre());
        personaExistente.setCorreo(persona.getCorreo());
        personaExistente.setFecha_nacimiento(persona.getFecha_nacimiento());
        personaExistente.setTelefono(persona.getTelefono());
        servicio.actualizarPersona(personaExistente);
        return "redirect:/persona";
    }

    @GetMapping("/persona/{id}")
    public String eliminarPersona(@PathVariable int id){
        servicio.eliminarpersona(id);
        return "redirect:/persona";
    }


}

