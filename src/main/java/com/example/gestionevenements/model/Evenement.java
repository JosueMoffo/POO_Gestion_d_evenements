package com.example.gestionevenements.model;

import com.example.gestionevenements.exception.CapaciteMaxAtteinteException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Evenement {
    protected String id;
    protected String nom;
    protected LocalDateTime date;
    protected String lieu;
    protected int capaciteMax;

    protected List<Participant> participants = new ArrayList<>();


    public Evenement(String id, String nom, LocalDateTime date, String lieu, int capaciteMax) {
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.lieu = lieu;
        this.capaciteMax = capaciteMax;
    }

    public abstract void ajouterParticipant(Participant participant) throws CapaciteMaxAtteinteException, CapaciteMaxAtteinteException;

    public abstract void annuler();

    public abstract String afficherDetails();

    public String getId() { return id;
    }
}