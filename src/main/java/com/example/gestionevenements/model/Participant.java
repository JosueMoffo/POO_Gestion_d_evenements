package com.example.gestionevenements.model;

public class Participant {
    protected String id;
    protected String nom;
    protected String email;

    public Participant(String id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    // Getters et setters
    public String getId() { return id; }
    public String getNom() { return nom; }
    public String getEmail() { return email; }
}