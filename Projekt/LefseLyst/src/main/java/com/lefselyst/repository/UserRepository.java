package com.lefselyst.repository;

import com.lefselyst.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Określa, że interfejs jest repozytorium
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository dostarcza podstawowe operacje CRUD
    // Long to typ klucza głównego encji User
}
