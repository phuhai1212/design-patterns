package com.example.designpatterns.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void reverseInteger_123456_Return_654321() {
        //given
        int n = 123456;
        //when
        int result = ReverseInteger.reverseInteger(n);
        //then
        Assertions.assertEquals(654321, result);
    }

    @Test
    void reverseInteger_912365891_Return_198563219() {
        //given
        int n = 912365891;
        //when
        int result = ReverseInteger.reverseInteger(n);
        //then
        Assertions.assertEquals(198563219, result);
    }
}