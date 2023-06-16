package com.example.democorrige.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "livre")
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column(nullable = false)
    //la ligne du dessus permet de dire que la var titre est obligatoire
    private String titre;
    @Column(nullable = true)
    //la ligne du dessus permet de dire que la var synopsis est facultative
    private String synopsis;
    @JoinColumn(nullable = false, name="auteur_id")
    @ManyToOne()
    private Auteur auteur;

    public Livre(String titre, String synopsis, Auteur auteur) {
        this.titre = titre;
        this.synopsis = synopsis;
        this.auteur = auteur;

    }
    public  Livre() {}

    //Mes getter et setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }
}


