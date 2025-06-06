package com.example.gestionevenements.model;

import java.util.ArrayList;
import java.util.List;

public class Organisateur extends Participant {
    private List<Evenement> evenementsOrganises = new ArrayList<>();

    public Organisateur(String id, String nom, String email) {
        super(id, nom, email);
    }

    public void ajouterEvenement(Evenement evenement) {
        evenementsOrganises.add(evenement);
    }

    public List<Evenement> getEvenementsOrganises() {
        return evenementsOrganises;
    }
}