package com.utilisateur;

import java.time.LocalDate;
import java.util.List;

public class Administrateur extends Moderateur{
    public Administrateur(String id, String nom, String email, LocalDate dateCreation, List<Utilisateur> utilisateurs, List<String> publications, List<String> commentaires) {
        super(id, nom, email, dateCreation, utilisateurs, publications, commentaires);
    }

    public boolean supprimerUtilisateur(String utilisateur) {
        for(Utilisateur utilisateurs: utilisateur) {
            if(utilisateurs.contains(utilisateur)){
                utilisateur.remove(utilisateurs);
                return true;
            }
        }
        return false;
    }
}
