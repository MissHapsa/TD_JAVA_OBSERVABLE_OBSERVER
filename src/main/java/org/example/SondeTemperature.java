package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class SondeTemperature {

    private final ArrayList<Observer> observers = new ArrayList<>();
    private int temperature;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if (temperature > 35) {
            notifyObservers();
        }
    }
    public void run() {
        while (true) {
            System.out.println("Entrez la température :");
            int temperature = new Scanner(System.in).nextInt();
            setTemperature(temperature);
            notifyObservers();

        }
    }
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
