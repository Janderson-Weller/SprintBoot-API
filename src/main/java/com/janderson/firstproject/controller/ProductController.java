package com.janderson.firstproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.janderson.firstproject.model.Product;

@RestController
@RequestMapping(value = "/lista")

public class ProductController {
    @GetMapping
    public List<Product> ProductController() {
        List <Product> lista =  new ArrayList<Product>();
        Product p1 =  new Product("Jabá", 23445, 456.87);
        Product p2 =  new Product("Carne Bovina", 5231, 46.87);
        Product p3 =  new Product("Feijão", 3675, 65.87);
        Product p4 =  new Product("Arroz", 43445, 6.87);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        return lista;
    }
}
