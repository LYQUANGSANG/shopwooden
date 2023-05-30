package com.sanglq.backend.domain;

public class Product {

    private String id;

    private String name;

    private double price;

    private String description;
    
    private String keyword;

    public Product(String id, String name, double price, String description) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.keyword = keyword;
        
    }
}