package com.janderson.firstproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.janderson.firstproject.model.Client;

@RestController
@RequestMapping("/")

public class HellowClient {

    @GetMapping
    public List<Client> HellowClient() {

        List listClient = new ArrayList<Client>();

        Client n1 = new Client("Janderson", "Weller",20, "Manaus - AM", "034.568.982-12");
        Client n2 = new Client("João", "Silva",23, "Belém - PA", "024.346.932-21");
        Client n3 = new Client("Wesley", "Souza",15, "Manaus - AM", "564.455.122-31");
        Client n4 = new Client("Jango", "Andrade",18, "Manaus - AM", "564.455.122-31");

        listClient.add(n1);
        listClient.add(n2);
        listClient.add(n3);
        listClient.add(n4);

        return listClient;
    }
}
