package com.example.designpatterns.structural.decorator.base;

public abstract class MilkTeaDecorator implements IMilkTea{
    private IMilkTea milkTea;
    protected MilkTeaDecorator(IMilkTea inner){
        milkTea = inner;
    }
    @Override
    public double cost() {
        return milkTea.cost();
    }
}
