package com.janderson.firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.janderson.firstproject.model.Client;

@RestController
@RequestMapping("/")

public class HelloWorld {

    @GetMapping
    public Client HelloWorld() {
        Client n1 = new Client("Janderson", "Weller",20, "Manaus - AM", "034.568.982-12");
        return n1;
    }
}
