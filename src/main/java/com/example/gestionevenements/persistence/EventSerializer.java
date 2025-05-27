package com.example.gestionevenements.persistence;

import com.example.gestionevenements.model.Evenement;

import java.util.Map;

public interface EventSerializer {
    String serialize(Map<String, Evenement> evenements, String filePath) throws Exception;
    Map<String, Evenement> deserialize(String data) throws Exception;
}