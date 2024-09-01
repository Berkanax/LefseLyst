package com.lefselyst.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Określa, że klasa jest encją JPA
public class User {

    @Id // Identyfikator encji
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatyczne generowanie wartości ID
    private Long id;

    private String username; // Nazwa użytkownika
    private String password; // Hasło użytkownika

    // Gettery i settery
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
