package com.example.designpatterns.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumberTest {

    @Test
    void addTwoNumber() {
        //given
        int a = 100;
        int b = 200;
        //when
        int result = AddTwoNumber.addTwoNumber(a, b, "ADD");
        //then
        Assertions.assertEquals(300, result);
    }

    @Test
    void addTwoNumber_false() {
        //given
        int a = 1;
        int b = 200;
        //when
        int result = AddTwoNumber.addTwoNumber(a, b, "MUL");
        //then
        Assertions.assertEquals(200, result);

    }
}