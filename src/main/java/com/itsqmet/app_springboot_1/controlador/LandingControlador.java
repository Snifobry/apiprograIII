package com.itsqmet.app_springboot_1.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingControlador {

    @GetMapping("/landing")
    public String holaMundo() {
        return "landing/landing.html";
    }
    //(( /) que empiece con ese backslash es una ruta que usa el sitio web una url
    @GetMapping("/bienvenida")
        //El (Model ) es una interface que envia datos a la vista desde los controladores en este caso Landing
        public String saludar(Model model){
        //el (    model) es la inicializacion de la interface
        //model.addAtribute =sirve para pasar los datos del backen controlador a la vista landing
        model.addAttribute("mensaje", "Hola Mundo");
        model.addAttribute("nombre", "Brayan");
        //este metodo retorna la vista ponemos su ruta
        //el que no tenga de inicio el " /" quiere decir q es la vista el template
        return "landing/bienvenida.html";

    }

    }

