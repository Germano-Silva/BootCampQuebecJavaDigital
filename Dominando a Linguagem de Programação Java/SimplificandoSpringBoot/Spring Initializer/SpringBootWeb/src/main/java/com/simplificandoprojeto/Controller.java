package com.simplificandoprojeto;
@RestController
public class Controller {
    @GetMapping("/")
    public String mensgagem(){
        return "Nosso primeiro projeto Spring Boot Web";
    }

}
