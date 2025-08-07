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
    private List<String> publication = new ArrayList<>();
    private List<String> commentaire = new ArrayList<>();

    public Utilisateur(String id, String nom, String email, LocalDate dateCreation, List<Utilisateur> utilisateurs, List<String> publication, List<String> commentaire) {
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

    public List<String> getPublication() {
        return publication;
    }

    public List<String> getCommentairer() {
        return commentaire;
    }

    public static String rechercherPublication(String motCle, List<String> publication) {
        return publication.stream().filter(p -> p.equals(motCle)).findFirst().get();
    }

    public static boolean rechercherUtilisateur(String nomUtilisateur, List<String> utilisateurs) {
        if (utilisateurs.contains(nomUtilisateur)) {
            return true;
        }
    }

    public static int coumpterTotalPublication(List<String> publication) {
        int totalPublication = 0;
        for(int i = 0; i < publication.size(); i++) {
            totalPublication++;
        }
        return totalPublication;
    }
}
