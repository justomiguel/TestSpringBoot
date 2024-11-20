package com.globant.talentodigital.demoweb.controller;

import com.globant.talentodigital.demoweb.entidades.Saludo;
import com.globant.talentodigital.demoweb.repositorio.SaludoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaludoController {

    @Autowired
    private SaludoRepository saludoRepository;

    @GetMapping("/")
    public String holaMundo(Model model) {
        // Guarda un saludo en la base de datos
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola Mundo desde la BD");
        saludoRepository.save(saludo);

        // Recupera el saludo desde la base de datos
        Saludo saludoDB = saludoRepository.findAll().get(0);
        model.addAttribute("mensaje", saludoDB.getMensaje());

        return "index";
    }

    @GetMapping("/aquamarina")
    public String holaMundoDesdeOtroLugar(Model model) {
        // Recupera el saludo desde la base de datos
        Saludo saludoDB = saludoRepository.findAll().get(1);
        model.addAttribute("mensaje", saludoDB.getMensaje());

        return "otro";
    }
}
