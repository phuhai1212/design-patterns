package com.example.designpatterns.algorithm.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySingleNumberTest {

    @Test
    void singleNumber() {
        int[] input = new int[]{2,2,1};
        int k = ArraySingleNumber.singleNumberV2(input);
        Assertions.assertEquals(1, k);
    }
}