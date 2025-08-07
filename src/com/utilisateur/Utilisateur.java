package com.utilisateur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private final String id;
    private final String nom;
    private final String email;
    private LocalDate dateCreation = LocalDate.now();
    private final List<Utilisateur> utilisateurs = new ArrayList<>();
    private String publication;

    public Utilisateur(String id, String nom, String email, LocalDate dateCreation, List<Utilisateur> utilisateurs) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.dateCreation = dateCreation;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }
}
