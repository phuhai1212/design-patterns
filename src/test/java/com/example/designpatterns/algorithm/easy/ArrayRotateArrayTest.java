package com.example.designpatterns.algorithm.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRotateArrayTest {
    @Test
    void rotate1() {
        int[] input = new int[]{1,2,3,4,5,6};
        ArrayRotateArray.rotateV2(input, 4);
        Assertions.assertArrayEquals(new int[]{3,4,5,6,1,2}, input);
    }
}