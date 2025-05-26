package com.example.gestionevenements.persistence;

import com.example.gestionevenements.model.Evenement;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Map;

public class XMLSerializer implements EventSerializer {
    @Override
    public void serialize(Map<String, Evenement> evenements, String filePath) throws Exception {
        JAXBContext context = JAXBContext.newInstance(EventWrapper.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(new

                EventWrapper(evenements), new File(filePath));
    }

    @Override
    public Map<String, Evenement> deserialize(String filePath) throws Exception {
        JAXBContext context = JAXBContext.newInstance(EventWrapper.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        EventWrapper wrapper = (EventWrapper) unmarshaller.unmarshal(new File(filePath));
        return wrapper.getEvenements();
    }
}