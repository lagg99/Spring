package com.platzi.platzi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundo {

    @GetMapping("/hola")
    public String saludar(){
        return "Nunca pares de aprender";
    }
}
