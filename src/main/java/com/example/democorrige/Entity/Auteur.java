package com.example.democorrige.Entity;

import jakarta.persistence.*;

@Entity
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(nullable = false)
    private String prenom;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private int bioauteur;
    public int getNaissanceauteur() {
        return naissanceauteur;
    }

    public void setNaissanceauteur(int naissanceauteur) {
        this.naissanceauteur = naissanceauteur;
    }

    @Column(nullable = false)
    private int naissanceauteur ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getBioauteur() {
        return bioauteur;
    }

    public void setBioauteur(int bioauteur) {
        this.bioauteur = bioauteur;
    }


}
