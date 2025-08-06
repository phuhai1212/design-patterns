package com.example.designpatterns.algorithm.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1004MaxConsecutiveOneIIITest {

    @Test
    void longestOnes() {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;

        Assertions.assertEquals(10, P1004MaxConsecutiveOneIII.longestOnes(nums, k));
    }

    @Test
    void longestOnes2() {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        Assertions.assertEquals(6, P1004MaxConsecutiveOneIII.longestOnes(nums, k));
    }

    @Test
    void longestOnes3() {
        int[] nums = {0,0,1,1,1,0,0};
        int k = 0;

        Assertions.assertEquals(3, P1004MaxConsecutiveOneIII.longestOnes(nums, k));
    }

    @Test
    void longestOnes4() {
        int[] nums = {1,1,1,0,0,0,1,0,1,0,0,1,1,1,1,0,1,0,1,1,1,0,1,1,0,1,0,1,1,0,1,1,0,1,1,1,0,0,0,1,0,0,0,1,1,1,1,0,0,1};
        int k = 10;

        Assertions.assertEquals(30, P1004MaxConsecutiveOneIII.longestOnes(nums, k));
    }

    @Test
    void longestOnes5() {
        int[] nums = {0,0,0,1};
        int k = 3;

        Assertions.assertEquals(4, P1004MaxConsecutiveOneIII.longestOnes(nums, k));
    }
}