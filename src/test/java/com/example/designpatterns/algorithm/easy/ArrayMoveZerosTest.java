package com.example.designpatterns.algorithm.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMoveZerosTest {

    @Test
    void moveZeroes() {
        int[] input = new int[]{0,1,0,3,12};
        ArrayMoveZeros.moveZeroes(input);
        int[] expected = new int[]{1,3,12,0,0};
        assertArrayEquals(expected, input);
    }

    @Test
    void moveZeroesNoZeros() {
        int[] input = new int[]{2,1};
        ArrayMoveZeros.moveZeroes(input);
        int[] expected = new int[]{2,1};
        assertArrayEquals(expected, input);
    }
}