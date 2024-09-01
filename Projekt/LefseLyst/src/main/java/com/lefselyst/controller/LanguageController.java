package com.lefselyst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import jakarta.servlet.http.HttpServletRequest;  // Import klasy HttpServletRequest z pakietu jakarta.servlet
import jakarta.servlet.http.HttpServletResponse; // Import klasy HttpServletResponse z pakietu jakarta.servlet
import java.util.Locale; // Import klasy Locale do obsługi lokalizacji

@Controller
public class LanguageController {

    // Metoda obsługująca żądanie GET na ścieżce /change-language
    @GetMapping("/change-language")
    public String changeLanguage(@RequestParam("lang") String lang, HttpServletRequest request, HttpServletResponse response) {
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request); // Pobiera LocaleResolver do zmiany języka
        if (localeResolver != null) {
            Locale locale = new Locale(lang); // Tworzy nową instancję Locale na podstawie parametru lang
            localeResolver.setLocale(request, response, locale); // Ustawia nowy język w LocaleResolver
        }
        return "redirect:/"; // Przekierowanie na stronę główną po zmianie języka
    }
}
