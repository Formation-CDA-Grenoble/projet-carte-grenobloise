package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import com.example.demo.model.External_link;
import com.example.demo.repository.External_linkRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


// Ce contrôleur fonctionne sur le modèle d'une API REST
@RestController
// Ce contrôleur répond à toutes les requêtes sur les endpoints /api/products
@RequestMapping("/api/external_link")
// Ce contrôleur accepte les requêtes venant d'un serveur différent
@CrossOrigin
public class External_linkController {

    // Injection de dépendance
    // Une instance de ProductRepository est automatiquement créée
    // et rangée dans cette propriété à la construction du contrôleur
    @Autowired
    private External_linkRepository external_linkRepository;
    
    // Renvoie tous les produits de la base de données
    @GetMapping("")
    public List<external_link> getAllexternal_link() {
        return external_linkRepository.findAll();
    }