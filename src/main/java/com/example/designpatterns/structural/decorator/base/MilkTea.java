package com.example.designpatterns.structural.decorator.base;

public class MilkTea implements IMilkTea{
    public MilkTea(){

    }
    @Override
    public double cost() {
        return 5d;
    }
}
