package com.lefselyst.model;

import jakarta.persistence.*;
import java.util.List;

@Entity // Określa, że klasa jest encją JPA
public class Order {

    @Id // Identyfikator encji
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatyczne generowanie wartości ID
    private Long id;

    private String customerName; // Imię klienta
    private String orderType; // Typ zamówienia (Na miejscu / Na wynos)

    @OneToMany // Relacja jeden do wielu z encją Product
    private List<Product> products; // Lista produktów w zamówieniu

    // Gettery i settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
