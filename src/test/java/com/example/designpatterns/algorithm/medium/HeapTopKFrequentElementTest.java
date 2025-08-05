package com.example.designpatterns.algorithm.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapTopKFrequentElementTest {
    @Test
    void test1() {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        Assertions.assertArrayEquals(new int[]{1,2}, HeapTopKFrequentElement.topKFrequent(nums, k));
    }
}