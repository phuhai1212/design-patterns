package com.example.designpatterns.structural.decorator.decorators;

import com.example.designpatterns.structural.decorator.base.IMilkTea;
import com.example.designpatterns.structural.decorator.base.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {
    public BlackSugar(IMilkTea inner) {
        super(inner);
    }
    @Override
    public double cost() {
        return 3d + super.cost();
    }
}
