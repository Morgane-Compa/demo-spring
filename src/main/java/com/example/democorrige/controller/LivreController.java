package com.example.democorrige.controller;

import com.example.democorrige.Entity.Livre;
import org.springframework.web.bind.annotation.*;
import com.example.democorrige.Services.LivreService;

import java.util.List;

@RestController
@RequestMapping("/livres")
public class LivreController {

    private LivreService livreService;

    public LivreController(LivreService livreService) {
        this.livreService = livreService;
    }

    @GetMapping("/bloop")
    @ResponseBody
    public List<Livre> livres() {
        return this.livreService.toutLesLivres();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Livre livre(@PathVariable int id) {
        return livreService.unLivre(id);
    }

    @PostMapping("/ajouter")
    @ResponseBody
    public Livre ajouter(@RequestParam String titre, @RequestParam String synopsis, @RequestParam int auteur_id) {
        return livreService.ajouterLivre(titre, synopsis, auteur_id);
    }
}
