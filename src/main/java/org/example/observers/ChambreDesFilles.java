package org.example.observers;

import org.example.Observer;

public class ChambreDesFilles implements Observer {
    private final String nom;

    public ChambreDesFilles(String chambreDesFilles) {
        this.nom = chambreDesFilles;
    }

    @Override
    public void update(int temperature) {
        if (temperature < 17) {
            System.out.println("Notification pour la chambre des filles : La température est trop basse (" + temperature + "°C).");
        } else if (temperature > 24) {
            System.out.println("Notification pour le client la chambre des filles: La température est trop élevée (" + temperature + "°C).");
        }
    }
}
