package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import com.example.demo.model.Tram_lines;
import com.example.demo.repository.Tram_linesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


// Ce contrôleur fonctionne sur le modèle d'une API REST
@RestController
// Ce contrôleur répond à toutes les requêtes sur les endpoints /api/products
@RequestMapping("/api/Tram_lines")
// Ce contrôleur accepte les requêtes venant d'un serveur différent
@CrossOrigin
public class Tram_linesController {

    // Injection de dépendance
    // Une instance de ProductRepository est automatiquement créée
    // et rangée dans cette propriété à la construction du contrôleur
    @Autowired
    private Tram_linesRepository tram_linesRepository;
    
    // Renvoie tous les produits de la base de données
    @GetMapping("")
    public List<tram_lines> getAlltram_lines() {
        returntram_linesRepository.findAll();
    }