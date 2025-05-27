package com.example.gestionevenements;

import com.example.gestionevenements.controller.AddEventController;
import com.example.gestionevenements.controller.EventController;
import com.example.gestionevenements.controller.HelloController;
import com.example.gestionevenements.controller.OrganisController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    private static Stage primaryStage;
    private static MainApp instance;

    public MainApp() {
        instance = this;
    }

    public static void main(String[] args) {launch();}

    @Override
    public void start(Stage primaryStage) throws IOException {
        MainApp.primaryStage = primaryStage;
        showHelloPage();
    }

    public void showHelloPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        HelloController controller = fxmlLoader.getController();
        controller.setMainApp(this);

        primaryStage.setTitle("Gestion d'evenement");
        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public void showEventPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("event-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        EventController controller = fxmlLoader.getController();
        controller.setMainApp(this);

        primaryStage.setTitle("Evenements");
        primaryStage.setScene(scene);
    }

    public void showOrganisPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("organis-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        OrganisController controller = fxmlLoader.getController();
        controller.setMainApp(this);

        primaryStage.setTitle("Organisateur");
        primaryStage.setScene(scene);
    }

    public void showAddEventPage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addEvent-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        AddEventController controller = fxmlLoader.getController();
        controller.setMainApp(this);

        primaryStage.setTitle("Ajouter un evenement");
        primaryStage.setScene(scene);
    }
}