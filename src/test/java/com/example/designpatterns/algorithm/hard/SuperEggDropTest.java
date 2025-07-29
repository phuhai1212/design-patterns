package com.example.designpatterns.algorithm.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperEggDropTest {

    @Test
    void superEggDrop1() {
        int k = 1;
        int n = 2;
        Assertions.assertEquals(2, SuperEggDrop.solve(k,n));
    }

    @Test
    void superEggDrop2() {
        int k = 2;
        int n = 6;
        Assertions.assertEquals(3, SuperEggDrop.solve(k,n));
    }

    @Test
    void superEggDrop3() {
        int k = 3;
        int n = 14;
        Assertions.assertEquals(4, SuperEggDrop.solve(k,n));
    }

    @Test
    void superEggDrop4() {
        int k = 4;
        int n = 500;
        Assertions.assertEquals(11, SuperEggDrop.solve(k,n));
    }

    @Test
    void superEggDrop5() {
        int k = 4;
        int n = 1000;
        Assertions.assertEquals(13, SuperEggDrop.solve(k,n));
    }

    @Test
    void superEggDrop6() {
        int k = 4;
        int n = 10000;
        Assertions.assertEquals(23, SuperEggDrop.solve(k,n));
    }
}