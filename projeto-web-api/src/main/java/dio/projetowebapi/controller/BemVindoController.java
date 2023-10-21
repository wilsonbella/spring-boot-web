package dio.projetowebapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BemVindoController {
    @GetMapping
    public String bemvindo(){
        return "Bem vindo ao Spring Boot Web API";
    }
}
