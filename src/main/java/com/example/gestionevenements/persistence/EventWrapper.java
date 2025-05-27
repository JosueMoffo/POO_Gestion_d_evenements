package com.example.gestionevenements.persistence;


import com.example.gestionevenements.model.Evenement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EventWrapper {
    private Map<String, Evenement> evenements = new HashMap<>();

    // Constructeur par défaut nécessaire pour JAXB
    public EventWrapper() {
    }

    public EventWrapper(Map<String, Evenement> evenements) {
        this.evenements = evenements;
    }

    public Map<String, Evenement> getEvenements() {
        return evenements;
    }

    public void setEvenements(Map<String, Evenement> evenements) {
        this.evenements = evenements;
    }
}