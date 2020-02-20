package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import com.example.demo.model.Mayor_name;
import com.example.demo.repository.Mayor_nameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/Mayor_name")
@CrossOrigin
public class Mayor_nameController {

    // Injection de dépendance
    @Autowired
    private Mayor_nameRepository mayor_nameRepository;
    
    // Renvoie tous les produits de la base de données
    @GetMapping("")
    public List<Mayor_name> getAllBrands() {
        return mayor_nameRepository.findAll();
    }