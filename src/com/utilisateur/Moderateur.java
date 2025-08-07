package com.utilisateur;

import java.time.LocalDate;
import java.util.List;

public class Moderateur extends Utilisateur {
    public Moderateur(String id, String nom, String email, LocalDate dateCreation,  List<Utilisateur> utilisateurs) {
        super(id, nom, email, dateCreation, utilisateurs);
    }

}
