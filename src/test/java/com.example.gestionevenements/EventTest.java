package com.example.gestionevenements;

import com.example.gestionevenements.exception.CapaciteMaxAtteinteException;
import com.example.gestionevenements.model.Concert;
import com.example.gestionevenements.model.Conference;
import com.example.gestionevenements.model.Participant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {
    private Conference conference;
    private Concert concert;
    private Participant participant;

    @BeforeEach
    void setUp() {
        conference = new Conference("conf1", "Conf IA", LocalDateTime.now(), "Salle 1", 50, "Intelligence Artificielle");
        concert = new Concert("conc1", "Concert Rock", LocalDateTime.now(), "Arena", 1000, "The Rockers", "Rock");
        participant = new Participant("part1", "Jean Dupont", "jean@example.com");
    }

    @Test
    void testAjouterParticipantConference() throws CapaciteMaxAtteinteException {
        conference.ajouterParticipant(participant);
        assertEquals(1, conference.getIntervenants().size());
        assertEquals("Jean Dupont", conference.getIntervenants().get(0).getNom());
    }

    @Test
    void testCapaciteMaxAtteinteConference() {
        assertThrows(CapaciteMaxAtteinteException.class, () -> {
            for (int i = 0; i < 60; i++) {
                conference.ajouterParticipant(
                        new Participant("part" + i, "Nom " + i, "email" + i + "@test.com")
                );
            }
        });
    }

    @Test
    void testAfficherDetailsConference() {
        String details = conference.afficherDetails();
        assertTrue(details.contains("Conférence: Conf IA"));
        assertTrue(details.contains("Thème: Intelligence Artificielle"));
    }

    @Test
    void testAfficherDetailsConcert() {
        String details = concert.afficherDetails();
        assertTrue(details.contains("Concert: Concert Rock"));
        assertTrue(details.contains("Artiste: The Rockers"));
    }
}