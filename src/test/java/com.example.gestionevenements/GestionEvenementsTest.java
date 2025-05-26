package com.example.gestionevenements;

import com.example.gestionevenements.exception.EvenementDejaExistantException;
import com.example.gestionevenements.exception.EvenementNotFoundException;
import com.example.gestionevenements.model.Concert;
import com.example.gestionevenements.model.Conference;
import com.example.gestionevenements.model.GestionEvenements;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class GestionEvenementsTest {
    private GestionEvenements gestion;
    private Conference conference;
    private Concert concert;

    @BeforeEach
    void setUp() {
        gestion = GestionEvenements.getInstance();
        gestion.getEvenements().clear(); // Nettoyer avant chaque test

        conference = new Conference("conf1", "Conf Test", LocalDateTime.now(), "Salle 1", 100, "Test");
        concert = new Concert("conc1", "Concert Test", LocalDateTime.now(), "Arena", 500, "Artiste", "Rock");
    }

    @Test
    void testSingleton() {
        GestionEvenements autreInstance = GestionEvenements.getInstance();
        assertSame(gestion, autreInstance);
    }

    @Test
    void testAjouterEvenement() throws EvenementDejaExistantException {
        gestion.ajouterEvenement(conference);
        assertEquals(1, gestion.getEvenements().size());
        assertTrue(gestion.getEvenements().containsKey("conf1"));
    }

    @Test
    void testEvenementDejaExistant() throws EvenementDejaExistantException {
        gestion.ajouterEvenement(conference);
        assertThrows(EvenementDejaExistantException.class, () -> {
            gestion.ajouterEvenement(conference);
        });
    }

    @Test
    void testSupprimerEvenement() throws EvenementDejaExistantException, EvenementNotFoundException {
        gestion.ajouterEvenement(conference);
        gestion.supprimerEvenement("conf1");
        assertEquals(0, gestion.getEvenements().size());
    }

    @Test
    void testSupprimerEvenementNonExistant() {
        assertThrows(EvenementNotFoundException.class, () -> {
            gestion.supprimerEvenement("inexistant");
        });
    }
}