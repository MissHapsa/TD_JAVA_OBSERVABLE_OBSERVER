package org.example.observers;

import org.example.Observer;

public class ChambreDesGarcons implements Observer {

    private final String nom;

    public ChambreDesGarcons(String chambreDesGarçons) {
        this.nom = chambreDesGarçons;
    }

    public void update(int temperature) {
        if (temperature < 17) {
            System.out.println("Notification pour la chambre des garcons : La température est trop basse (" + temperature + "°C).");
        } else if (temperature > 24) {
            System.out.println("Notification pour la chambre des garcons : La température est trop élevée (" + temperature + "°C).");

        }

    }

}
