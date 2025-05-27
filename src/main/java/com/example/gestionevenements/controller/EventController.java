package com.example.gestionevenements.controller;

import com.example.gestionevenements.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EventController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(" EVENT CONTROLEUR: ");
    }
    public MainApp mainApp;
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void onBackHello() throws IOException {
        mainApp.showHelloPage();
    }
}
