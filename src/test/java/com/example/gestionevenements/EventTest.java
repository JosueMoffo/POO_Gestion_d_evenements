package com.example.gestionevenements;

import com.example.gestionevenements.model.Conference;
import com.example.gestionevenements.model.Evenement;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EventTest {

    @Test
    void testConferenceCreation() {
        Evenement conference = new Conference(
                "conf1",
                "Test Conf",
                LocalDateTime.now(),
                "Room 101",
                100,
                "Test Theme"
        );

        assertNotNull(conference);
        assertEquals("Test Conf", conference.getNom());
    }
}