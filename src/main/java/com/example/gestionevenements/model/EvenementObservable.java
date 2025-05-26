package com.example.gestionevenements.model;

import java.util.ArrayList;
import java.util.List;

public class EvenementObservable {
    private List<ParticipantObserver> observers = new ArrayList<>();

    public void ajouterObserver(ParticipantObserver observer) {
        observers.add(observer);
    }

    public void supprimerObserver(ParticipantObserver observer) {
        observers.remove(observer);
    }

    public void notifierObservers(String message) {
        for (ParticipantObserver observer : observers) {
            observer.envoyerNotification(message);
        }
    }
}