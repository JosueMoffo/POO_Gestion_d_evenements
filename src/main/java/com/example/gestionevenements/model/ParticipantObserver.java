package com.example.gestionevenements.model;

public class ParticipantObserver implements NotificationService {
    private Participant participant;

    public ParticipantObserver(Participant participant) {
        this.participant = participant;
    }

    @Override
    public void envoyerNotification(String message) {
        System.out.println("Notification envoyée à " + participant.getEmail() + ": " + message);
        // Ici, on pourrait implémenter un vrai système d'envoi d'email
    }
}