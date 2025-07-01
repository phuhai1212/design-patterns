package com.example.designpatterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignPatternsApplicationTest {

    @Test
    void plusTwoNumber() {
        assertEquals(4, DesignPatternsApplication.calculateTwoNumber(2,2, "ADD"));
    }

    @Test
    void multiplyTwoNumber() {
        assertEquals(4, DesignPatternsApplication.calculateTwoNumber(2,2, "MUL"));
    }
}