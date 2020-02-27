package com.example.back.controller;

import java.util.List;

import com.example.back.model.place;
import com.example.back.repository.PlaceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/back/place")
@CrossOrigin
public class Placecontroller {

    // Injection de dépendance
    @Autowired
    private PlaceRepository placeRepository;
    private Jparepository<place, Long> placerepository;
    
    // Renvoie tous les Places de la base de données
    @GetMapping("")
    public List<Place> getAllPlace() {
        return placerepository.findAll();
    }
}