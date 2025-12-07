package com.pamp.pampero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/hola")
    public String saludar(){
        return "buenos días su señoría mandan tiru lara la";
    }
}
