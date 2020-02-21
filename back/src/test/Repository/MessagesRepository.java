package com.example.Controller;

import java.time.temporal.TemporalField;

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

    private final TextField firstName = new TextField("First name");
    private final TextField lastName = new TextField("Last name");
    private final TextField Comment = new TextField("Comment");
    private final TextField email = new TextField("Email");
    
    private final Button send = new Button("Send");
    

    @Autowired
    private MessagesController tram_linesRepository;
    
    // Renvoie tous les produits de la base de données
    @GetMapping("")
    public void getAlltram_lines() {
        MessagesController.findAll();
    }

    private static void findAll() {
    }
}