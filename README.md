Ce projet est réalisé dans le cadre du cours **Programmation Orientée Objet II (POO2)** à l'École Nationale Supérieure Polytechnique de Yaoundé.

##  Réalisé par
Mbah Moffo Josue  
Étudiant en 3GI    
Encadrant : **Pr Kungne**

=> Ce projet a pour but de concevoir un système modulaire et évolutif permettant :

- La gestion complète d'événements (création, modification, suppression)
- L'inscription et la désinscription de participants
- La gestion des organisateurs
- L'envoi de notifications en temps réel
- La persistance des données en JSON ou XML (Json dans notre cas)

=> Ce système a été développé avec une approche orientée objet avancée, 
intégrant plusieurs design patterns pour garantir la maintenabilité et la scalabilité de l’architecture.

=>Fonctionnalités principales

Création, recherche, mise à jour et suppression d’événements
Gestion des organisateurs et des participants
Notifications en temps réel lors de modifications ou d’annulations
Persistance automatique des données via fichiers JSON
Tests unitaires avec **JUnit 5**
Support du Pattern Observer pour le système de notifications

=> Technologies utilisées

| Technologie       | Description                                                    |
|------------------|----------------------------------------------------------------|
| Java 21          | Langage principal, avec Streams et CompletableFuture           |
| JavaFX           | Interface graphique (MVC)                                      |
| Jackson          | Sérialisation JSON                                             |
| JUnit 5          | Tests unitaires                                                |
| Git & GitHub     | Gestion de version                                             |
| Design Patterns  | Singleton, Observer, Factory                                   |
| UML 


=> Lancement de l'application

1. Cloner le dépôt
bash$
git clone https://github.com/JosueMoffo/POO_Gestion_d_evenements.git

2.Ouvrir dans IntelliJ IDEA (ou tout autre IDE Java)

3.Exécuter 
<mvn clean install> puis <mbn clean compile> et enfin <mvn javafx:run> ou <MainApp.java> via l'interface de l'IDE

L’application JavaFX se lancera avec une interface intuitive.


