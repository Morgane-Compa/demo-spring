package com.example.democorrige.Services;

import com.example.democorrige.Entity.Auteur;
import com.example.democorrige.Repository.AuteurRepository;
import org.springframework.stereotype.Service;

@Service
public class AuteurService {
    private AuteurRepository auteurRepository;

    public AuteurService(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;
    }

    public Auteur unAuteur(int id) {
        return auteurRepository.getById(id);
    }
}
