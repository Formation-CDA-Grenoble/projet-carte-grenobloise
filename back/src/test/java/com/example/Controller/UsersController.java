package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import com.example.demo.model.habitants_number;
import com.example.demo.repository.habitants_numberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


// Ce contrôleur fonctionne sur le modèle d'une API REST
@RestController
// Ce contrôleur répond à toutes les requêtes sur les endpoints /api/products
@RequestMapping("/api/habitants_number")
// Ce contrôleur accepte les requêtes venant d'un serveur différent
@CrossOrigin
public class habitants_numberController {

    // Injection de dépendance
    // Une instance de ProductRepository est automatiquement créée
    // et rangée dans cette propriété à la construction du contrôleur
    @Autowired
    private habitants_numberRepository productRepository;
    
    // Renvoie tous les produits de la base de données
    @GetMapping("")
    public List<habitants_number> getAllhabitants_number() {
        return habitants_numberRepository.findAll();
    }