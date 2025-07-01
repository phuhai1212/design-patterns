package com.example.designpatterns.behavioral.observer.base;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attachObserver(Observer observer){
        this.observers.add(observer);
    }

    public void detachObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(Subject subject, Object arg){
        this.observers.forEach(observer -> observer.notify(subject, arg));
    }
}
