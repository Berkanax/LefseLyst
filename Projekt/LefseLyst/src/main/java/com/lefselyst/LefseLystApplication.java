package com.lefselyst; // Pakiet, w którym znajduje się aplikacja

import org.springframework.boot.SpringApplication; // Import klasy SpringApplication do uruchamiania aplikacji
import org.springframework.boot.autoconfigure.SpringBootApplication; // Import adnotacji SpringBootApplication

@SpringBootApplication // Adnotacja oznaczająca główną klasę konfiguracyjną Spring Boot
public class LefseLystApplication {

    // Główna metoda uruchomieniowa aplikacji
    public static void main(String[] args) {
        SpringApplication.run(LefseLystApplication.class, args); // Uruchomienie aplikacji Spring Boot
    }
}
