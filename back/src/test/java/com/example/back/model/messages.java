package com.example.back.model;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


// Cette classe est une entité de la BDD
@Entity
// Elle correspond à la table `product`
@Table(name = "messages")
@EntityListeners(AuditingEntityListener.class)
public class Messages {

    // Cette propriété est la clé primaire de l'entité
    @Id
    // Cette propriété s'auto-incrémente
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Cette propriété correspond à la colonne `id` en BDD
    // Elle est unique et ne peut pas être nulle
    @Column(name = "id", unique = true, nullable = false)
    private long id;

    // Getter (permet d'accéder à cette propriété)
    public long getId() {
    	return this.id;
    }

    // Setter (permet de modifier cette propriété)
    public void setId(long id) {
    	this.id = id;
    }

    @Column(name = "name", nullable = false)
    private String name;


    public String getName() {
    	return this.name;
    }
    public void setName(String name) {
    	this.name = name;
    }

    @Column(name = "firstname", nullable = false)
    private String serialNumber;


    public String getfirstname() {
    	return this.firstname;
    }
    public void setfirstname(String firstname) {
    	this.firstname = firstname;
    }

    @Column(name = "email", nullable = false)
    private String description;

    
    public String getemail() {
    	return this.email;
    }
    public void setemail(String email) {
    	this.email = email;
    }

