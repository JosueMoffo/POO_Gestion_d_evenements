package com.example.gestionevenements.model;

import com.example.gestionevenements.exception.CapaciteMaxAtteinteException;

import java.time.LocalDateTime;

public class Concert extends Evenement {
    private String artiste;
    private String genreMusical;

    public Concert(String id, String nom, LocalDateTime date, String lieu, int capaciteMax, String artiste, String genreMusical) {
        super(id, nom, date, lieu, capaciteMax);
        this.artiste = artiste;
        this.genreMusical = genreMusical;
    }

    @Override
    public void ajouterParticipant(Participant participant) throws CapaciteMaxAtteinteException {
        if (participants.size() >= capaciteMax) {
            throw new CapaciteMaxAtteinteException("La capacité maximale est atteinte pour ce concert.");
        }
        participants.add(participant);
    }

    @Override
    public void annuler() {
        // Logique d'annulation spécifique aux concerts
    }

    @Override
    public String afficherDetails() {
        return String.format("Concert: %s, Artiste: %s, Genre: %s, Date: %s, Lieu: %s",
                nom, artiste, genreMusical, date, lieu);
    }

    // Getters
    public String getArtiste() { return artiste; }
    public String getGenreMusical() { return genreMusical; }
}