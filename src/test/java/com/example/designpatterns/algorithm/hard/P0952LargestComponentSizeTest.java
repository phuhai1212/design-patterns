package com.example.designpatterns.algorithm.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0952LargestComponentSizeTest {

    @Test
    void largestComponentSize() {
        int[] input = {2,3,6,7,4,12,21,39};
        Assertions.assertEquals(8, P0952LargestComponentSize.largestComponentSize(input));
    }
}