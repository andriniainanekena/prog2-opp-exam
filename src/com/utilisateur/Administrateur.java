package com.utilisateur;

import java.time.LocalDate;
import java.util.List;

public class Administrateur extends Moderateur{
    public Administrateur(String id, String nom, String email, LocalDate dateCreation, List<Utilisateur> utilisateurs, List<String> publication, List<String> commentaire) {
        super(id, nom, email, dateCreation, utilisateurs, publication, commentaire);
    }
}
