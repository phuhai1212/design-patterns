package com.example.designpatterns.creational.factorymethod;

public class JSONMessage extends Message{

    @Override
    public String getContent() {
        return "JSON";
    }
}
