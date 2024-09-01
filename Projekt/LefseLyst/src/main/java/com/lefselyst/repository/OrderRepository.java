package com.lefselyst.repository;

import com.lefselyst.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Określa, że interfejs jest repozytorium
public interface OrderRepository extends JpaRepository<Order, Long> {
    // JpaRepository dostarcza podstawowe operacje CRUD
    // Long to typ klucza głównego encji Order
}
