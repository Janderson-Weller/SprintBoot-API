package com.janderson.firstproject.model;

public class Product {
    private String name;
    private Double value;
    private Integer cod;

    public Product() {}
    
    public Product(String name, Integer cod, Double value) {
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

    public Integer getCod() {
        return this.cod;
    } 

    public void setCod(Integer cod) {
        this.cod = cod;
    }
}
