package com.itsqmet.app_springboot_1.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NosotrosControlador {

    @GetMapping("/nosotros")
        public String nosotros() {
            return "/landing/nosotros.html";
        }


}
