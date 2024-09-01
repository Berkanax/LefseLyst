package com.lefselyst.repository;

import com.lefselyst.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Określa, że interfejs jest repozytorium
public interface ProductRepository extends JpaRepository<Product, Long> {
    // JpaRepository dostarcza podstawowe operacje CRUD
    // Long to typ klucza głównego encji Product
}
