package org.example.observers;

import org.example.Observer;

public class SalleDeBain implements Observer {
    private final String nom;

    public SalleDeBain(String salleDeBain) {
        this.nom = salleDeBain;
    }

    public void update(int temperature) {
        if (temperature < 17) {
            System.out.println("Notification pour la salle de bain : La température est trop basse (" + temperature + "°C).");
        } else if (temperature > 24) {
            System.out.println("Notification pour la salle de bain : La température est trop élevée (" + temperature + "°C).");
        }
    }
}