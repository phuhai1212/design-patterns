package com.example.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ticket {
    private double price;
    private String name;
    private PromoteStrategy promoteStrategy;

    public double getPromotedPrice(){
        return this.promoteStrategy.doDiscount(this.price);
    }
}
