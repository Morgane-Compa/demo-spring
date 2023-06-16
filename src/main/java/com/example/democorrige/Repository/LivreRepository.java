package com.example.democorrige.Repository;

import com.example.democorrige.Entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface LivreRepository extends JpaRepository<Livre, Integer> {
    // public List<Livre> findAll();
}