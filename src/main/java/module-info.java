module com.example.gestionevenements {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires com.fasterxml.jackson.databind;
    requires java.xml.bind;
    //requires org.junit.jupiter.api;
    //requires org.opentest4j;

    opens com.example.gestionevenements to javafx.fxml, org.junit.platform.commons;

    exports com.example.gestionevenements;
    exports com.example.gestionevenements.controller;
    opens com.example.gestionevenements.controller to javafx.fxml;
}