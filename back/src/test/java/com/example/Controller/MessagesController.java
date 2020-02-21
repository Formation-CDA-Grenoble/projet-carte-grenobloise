package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Ce contrôleur fonctionne sur le modèle d'une API REST
@RestController
// Ce contrôleur répond à toutes les requêtes sur les endpoints /api/products
@RequestMapping("/api/Tram_lines")
// Ce contrôleur accepte les requêtes venant d'un serveur différent
@CrossOrigin
public class MessagesController {

    // Injection de dépendance
    // Une instance de ProductRepository est automatiquement créée
    // et rangée dans cette propriété à la construction du contrôleur
    @Autowired
    private Tram_linesRepository tram_linesRepository;
    private Object returntram_linesRepository;
    
    // Renvoie tous les produits de la base de données
    @GetMapping("")
    public List<tram_lines> getAlltram_lines() {
        ((Object) returntram_linesRepository).findAll();
    }

} 