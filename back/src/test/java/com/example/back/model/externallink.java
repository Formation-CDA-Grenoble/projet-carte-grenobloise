package com.example.back.model;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;


// Cette classe est une entité de la BDD
@Entity
// Elle correspond à la table `external_link`
@Table(name = "externallink")
@EntityListeners(AuditingEntityListener.class)
public class Externallink {

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

    @Column(name = "idplace", nullable = false)
    private int idplace;


    public int getidplace() {
    	return this.idplace;
    }
    public void setidplace(int idplace) {
    	this.idplace = idplace;
    }

	public static List<Externallink> findAll() {
		return null;
	}

    