package com.lefselyst.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Adnotacja określająca, że klasa jest encją JPA
public class Product {

    @Id // Identyfikator encji
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatyczne generowanie wartości ID
    private Long id;

    private String name; // Nazwa produktu
    private double price; // Cena produktu

    // Gettery i settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
