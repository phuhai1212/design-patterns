package com.example.designpatterns.structural.decorator.decorators;

import com.example.designpatterns.structural.decorator.base.IMilkTea;
import com.example.designpatterns.structural.decorator.base.MilkTeaDecorator;

public class Bubble extends MilkTeaDecorator {
    public Bubble(IMilkTea inner) {
        super(inner);
    }
    @Override
    public double cost() {
        return 1d + super.cost();
    }
}
