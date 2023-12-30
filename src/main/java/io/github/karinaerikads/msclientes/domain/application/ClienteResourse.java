package io.github.karinaerikads.msclientes.domain.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class ClienteResourse {

    @GetMapping
    public String status(){
        return "ok";
    }
}
