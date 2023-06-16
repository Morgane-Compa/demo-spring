package com.example.democorrige.Services;

import com.example.democorrige.Entity.Auteur;
import com.example.democorrige.Entity.Livre;
import com.example.democorrige.Repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//J'importe le service
@Service
public class LivreService {
    //J'appelle le fichier LivreRepository
    private LivreRepository livreRepository;
    private  AuteurService auteurService;

    @Autowired
    //Mon constructor
    //Toujours en public, jamais en private
    //ici le lr devrais être remplacé par livreRepository mais pour des soucis de compréhention je les ai mis en lr pour comprendre que c'est juste un nom que j'ai donné a mon argument
    public LivreService(LivreRepository lr, AuteurService auteurService) {
        this.livreRepository = lr;
        this.auteurService = auteurService;
    }

    public List<Livre> toutLesLivres() {
        return this.livreRepository.findAll();
    }

    public Livre unLivre(int id) {
        return this.livreRepository.getById(id);
    }

    public Livre ajouterLivre(String titre, String synopsis, int auteurId) {
        Auteur a = auteurService.unAuteur(auteurId);
        Livre l = new Livre(titre, synopsis, a);
        return livreRepository.saveAndFlush(l);  //le .save tout seul ne sauvegarde pas dans la base de données, il faut faire un saveandflush pour que ce soit le cas
        }

    public
}
