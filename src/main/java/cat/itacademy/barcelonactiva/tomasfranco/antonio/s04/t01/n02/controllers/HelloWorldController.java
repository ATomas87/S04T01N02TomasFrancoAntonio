package cat.itacademy.barcelonactiva.tomasfranco.antonio.s04.t01.n02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name){
        return "Hola, " + name + ". Estás ejecutando un proyecto Gradle.";
    }

    @GetMapping("/HelloWorld/{name}")
    public String saluda2(@PathVariable String name){
        return "Hola, " + name + ". Estás ejecutando un proyecto Gradle.";
    }
}
