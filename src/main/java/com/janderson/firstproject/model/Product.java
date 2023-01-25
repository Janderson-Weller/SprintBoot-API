package com.janderson.firstproject.model;

public class Product {
    private String name;
    private Double value;
    private Double cod;

    public Product() {}
    
    public Product(String name, Double cod, Double value) {
        this.name = name;
        this.cod = cod;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getCod() {
        return this.cod;
    } 

    public void setCod(Double cod) {
        this.cod = cod;
    }
}
