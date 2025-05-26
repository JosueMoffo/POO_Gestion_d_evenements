package com.example.gestionevenements.persistence;

import com.example.gestionevenements.model.Evenement;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class JSONSerializer implements EventSerializer {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String serialize(Map<String, Evenement> evenements) throws Exception {
        return objectMapper.writeValueAsString(evenements);
    }

    @Override
    public Map<String, Evenement> deserialize(String data) throws Exception {
        return objectMapper.readValue(data,
                objectMapper.getTypeFactory().constructMapType(Map.class, String.class, Evenement.class));
    }
}