package com.example.gestionevenements;

import com.example.gestionevenements.model.Concert;
import com.example.gestionevenements.model.Conference;
import com.example.gestionevenements.model.Evenement;
import com.example.gestionevenements.persistence.JSONSerializer;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SerializationTest {
    @Test
    void testJSONSerialization() throws Exception {
        JSONSerializer serializer = new JSONSerializer();

        Map<String, Evenement> evenements = new HashMap<>();
        evenements.put("conf1", new Conference("conf1", "Conf Test", LocalDateTime.now(), "Salle 1", 100, "Test"));
        evenements.put("conc1", new Concert("conc1", "Concert Test", LocalDateTime.now(), "Arena", 500, "Artiste", "Rock"));

        String json = serializer.serialize(evenements);
        assertNotNull(json);
        assertTrue(json.contains("Conf Test"));
        assertTrue(json.contains("Concert Test"));

        Map<String, Evenement> deserialized = serializer.deserialize(json);
        assertEquals(2, deserialized.size());
        assertTrue(deserialized.get("conf1") instanceof Conference);
        assertTrue(deserialized.get("conc1") instanceof Concert);
    }
}