package com.example.designpatterns.behavioral.strategy;

public class Discount1 implements PromoteStrategy{
    @Override
    public double doDiscount(double price) {
        return price * 0.75;
    }
}
