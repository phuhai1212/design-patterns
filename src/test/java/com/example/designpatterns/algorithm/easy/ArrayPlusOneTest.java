package com.example.designpatterns.algorithm.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPlusOneTest {

    @Test
    void plusOne1299() {
        int[] input = new int[]{1,2,9,9};
        int[] expected = new int[]{1,3,0,0};
        Assertions.assertArrayEquals(expected, ArrayPlusOne.plusOne(input));
    }
    @Test
    void plusOne99() {
        int[] input = new int[]{9,9};
        int[] expected = new int[]{1,0,0};
        Assertions.assertArrayEquals(expected, ArrayPlusOne.plusOne(input));
    }
    @Test
    void plusOne2() {
        int[] input = new int[]{2};
        int[] expected = new int[]{3};
        Assertions.assertArrayEquals(expected, ArrayPlusOne.plusOne(input));
    }
}