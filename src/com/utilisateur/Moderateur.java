package com.utilisateur;

import java.time.LocalDate;
import java.util.List;

public class Moderateur extends Utilisateur {
    public Moderateur(String id, String nom, String email, LocalDate dateCreation, List<Utilisateur> utilisateurs, List<String> publications, List<String> commentaires) {
        super(id, nom, email, dateCreation, utilisateurs, publications, commentaires);
    }

    public boolean supprimerPublication(String publication) {
        for(String publications: publication){
            if(publications.contains(publication)){
                publication.remove(publications);
                return true;
            }
        }
        return false;
    }

    public boolean supprimerCommentaires(String commentaire) {
        for(String commentaires: commentaire){
            if(commentaires.contains(commentaire)){
                commentaire.remove(commentaires);
                return true;
            }
        }
        return false;
    }



}
