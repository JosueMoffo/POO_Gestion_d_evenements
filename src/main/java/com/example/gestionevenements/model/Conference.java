package com.example.gestionevenements.model;

import com.example.gestionevenements.exception.CapaciteMaxAtteinteException;

import java.time.LocalDateTime;
import java.util.List;

public class Conference extends Evenement {
    private String theme;
    private List<Intervenant> intervenants;

    public Conference(String id, String nom, LocalDateTime date, String lieu, int capaciteMax, String theme) {
        super(id, nom, date, lieu, capaciteMax);
        this.theme = theme;
    }

    @Override
    public void ajouterParticipant(Participant participant) throws CapaciteMaxAtteinteException {
        if (participants.size() >= capaciteMax) {
            throw new CapaciteMaxAtteinteException("La capacité maximale est atteinte pour cette conférence.");
        }
        participants.add(participant);
    }

    @Override
    public void annuler() {
        // Logique d'annulation spécifique aux conférences
    }

    @Override
    public String afficherDetails() {
        return String.format("Conférence: %s, Thème: %s, Date: %s, Lieu: %s", nom, theme, date, lieu);
    }

    // Getters
    public String getTheme() { return theme; }
    public List<Intervenant> getIntervenants() { return intervenants; }
    public void setIntervenants(List<Intervenant> intervenants) { this.intervenants = intervenants; }
}