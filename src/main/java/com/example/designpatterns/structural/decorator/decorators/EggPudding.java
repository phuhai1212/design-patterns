package com.example.designpatterns.structural.decorator.decorators;

import com.example.designpatterns.structural.decorator.base.IMilkTea;
import com.example.designpatterns.structural.decorator.base.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {
    public EggPudding(IMilkTea inner) {
        super(inner);
    }
    @Override
    public double cost() {
        return 1.5d + super.cost();
    }
}
