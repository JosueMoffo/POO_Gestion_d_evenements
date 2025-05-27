package com.example.gestionevenements;

import com.example.gestionevenements.model.Concert;
import com.example.gestionevenements.model.Conference;
import com.example.gestionevenements.model.Evenement;
import com.example.gestionevenements.persistence.XMLSerializer;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class XMLSerializationTest {
    @Test
    void testXMLSerialization() throws Exception {
        XMLSerializer serializer = new XMLSerializer();
        String testFile = "test-events.xml";

        Map<String, Evenement> evenements = new HashMap<>();
        evenements.put("conf1", new Conference("conf1", "Conf Test", LocalDateTime.now(), "Salle 1", 100, "Test"));
        evenements.put("conc1", new Concert("conc1", "Concert Test", LocalDateTime.now(), "Arena", 500, "Artiste", "Rock"));

        // Test de sérialisation
        serializer.serialize(evenements, testFile);

        // Test de désérialisation
        Map<String, Evenement> deserialized = serializer.deserialize(testFile);
        assertEquals(2, deserialized.size());
        assertTrue(deserialized.get("conf1") instanceof Conference);
        assertTrue(deserialized.get("conc1") instanceof Concert);

        // Nettoyage
        new java.io.File(testFile).delete();
    }
}