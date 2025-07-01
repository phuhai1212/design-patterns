package com.example.designpatterns.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayLargestDivisibleSubsetTest {
    @Test
    void test1() {
        int[] input = new int[]{2, 9, 4, 3, 6, 12};

        List<Integer> result = ArrayLargestDivisibleSubset.largestDivisibleSubset(input);
        System.out.println(result);
    }

    @Test
    void test2() {
        int[] input = new int[]{2, 9, 4, 3, 6, 12, 27, 81};

        List<Integer> result = ArrayLargestDivisibleSubset.largestDivisibleSubset(input);
        System.out.println(result);
    }

    @Test
    void test13() {
        int[] input = new int[]{5,9,18,54,108,540,90,180,360,720};

        List<Integer> result = ArrayLargestDivisibleSubset.largestDivisibleSubset(input);
        System.out.println(result);

        int[] expected = new int[]{9,18,90,180,360,720};
        Assertions.assertArrayEquals(expected, result.stream().mapToInt(Integer::intValue).toArray());
    }
}