package com.example.designpatterns.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void solveTwoSum() {
        //given
        int[] nums = {2,7,11,5};
        int target = 9;
        //when
        int[] result = TwoSum.solveTwoSum(nums, target);
        int[] expected = {0, 1};
        //then
        Arrays.sort(result);
        Arrays.sort(expected);
        Assertions.assertArrayEquals(expected, result);
    }
}