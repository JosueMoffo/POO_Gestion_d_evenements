package com.example.gestionevenements.model;


import com.example.gestionevenements.exception.EvenementDejaExistantException;
import com.example.gestionevenements.exception.EvenementNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class GestionEvenements {
    private static GestionEvenements instance;
    private Map<String, Evenement> evenements = new HashMap<>();

    private GestionEvenements() {}

    public static synchronized GestionEvenements getInstance() {
        if (instance == null) {
            instance = new GestionEvenements();
        }
        return instance;
    }

    public void ajouterEvenement(Evenement evenement) throws EvenementDejaExistantException {
        if (evenements.containsKey(evenement.getId())) {
            throw new EvenementDejaExistantException("Un événement avec cet ID existe déjà.");
        }
        evenements.put(evenement.getId(), evenement);
    }

    public void supprimerEvenement(String id) throws EvenementNotFoundException {
        if (!evenements.containsKey(id)) {
            throw new EvenementNotFoundException("Événement non trouvé avec l'ID: " + id);
        }
        evenements.remove(id);
    }

    public Evenement rechercherEvenement(String id) throws EvenementNotFoundException {
        Evenement evenement = evenements.get(id);
        if (evenement == null) {
            throw new EvenementNotFoundException("Événement non trouvé avec l'ID: " + id);
        }
        return evenement;
    }

    public Map<String, Evenement> getEvenements() {
        return evenements;
    }
}