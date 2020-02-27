package com.example.back.controller;

import java.util.List;

import com.example.back.model.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// Ce contrôleur fonctionne sur le modèle d'une API REST
@RestController
// Ce contrôleur répond à toutes les requêtes sur les endpoints /api/products
@RequestMapping("/back/users")
// Ce contrôleur accepte les requêtes venant d'un serveur différent
@CrossOrigin
public class Userscontroller<usersrepository> {

    // Injection de dépendance
    // Une instance de ProductRepository est automatiquement créée
    // et rangée dans cette propriété à la construction du contrôleur
    @Autowired
    private Usersrepository usersrepository;
    
    // Renvoie tous les produits de la base de données
    @GetMapping("")
    public List<Users> getAllusers() {
        return usersrepository.findAll();
    }
}