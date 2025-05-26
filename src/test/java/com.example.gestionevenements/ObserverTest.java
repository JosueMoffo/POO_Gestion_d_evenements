package com.example.gestionevenements;


import com.example.gestionevenements.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {
    @Test
    void testNotificationSystem() {
        Participant participant = new Participant("part1", "Jean Dupont", "jean@test.com");
        ParticipantObserver observer = new ParticipantObserver(participant);

        EvenementObservable observable = new EvenementObservable();
        observable.ajouterObserver(observer);

        // Test de notification
        assertDoesNotThrow(() -> {
            observable.notifierObservers("Test notification");
        });
    }
}