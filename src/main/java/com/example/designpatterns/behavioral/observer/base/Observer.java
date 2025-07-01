package com.example.designpatterns.behavioral.observer.base;

public abstract class Observer {
    protected Subject subject;
    public abstract void notify(Subject subject, Object arg);
}
