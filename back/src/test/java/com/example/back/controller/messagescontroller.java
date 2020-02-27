package com.example.back.controller;

import java.util.List;

import javax.xml.soap.MessageFactory;

import com.mysql.cj.protocol.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Ce contrôleur fonctionne sur le modèle d'une API REST
@RestController
// Ce contrôleur répond à toutes les requêtes sur les endpoints /api/Messages
@RequestMapping("/back/messages")
// Ce contrôleur accepte les requêtes venant d'un serveur différent
@CrossOrigin
public class messagescontroller {

    // Injection de dépendance
    // Une instance de MessagesRepository est automatiquement créée
    // et raMessagesrepositoryopriété à la construction du contrôleur
    @Autowired
    private Messagerepository
    private Messagerepository messagesrepository;

    // Renvoie tous les Messages de la base de données
    @GetMapping("")
    public List<Message> getAllmessages() {
         Object returnmessagesrepository;
		returnmessagesrepository;
         returnmessagesrepository).findAll();
    }

    private  returnmessagesrepository(returnmessagesrepository) {
        return null;
    }
}