package org.example;
import org.example.observers.ChambreDesFilles;
import org.example.observers.ChambreDesGarcons;
import org.example.observers.SalleDeBain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SondeTemperature sondeTemperature = new SondeTemperature();
        SalleDeBain salleDeBain = new SalleDeBain("Salle de bain");
        ChambreDesFilles chambreDesFilles = new ChambreDesFilles("Chambre des filles");
        ChambreDesGarcons chambreDesGarcons = new ChambreDesGarcons("Chambre des garçons");
        sondeTemperature.addObserver(salleDeBain);
        sondeTemperature.addObserver(chambreDesFilles);
        sondeTemperature.addObserver(chambreDesGarcons);
        sondeTemperature.run();
    }
}