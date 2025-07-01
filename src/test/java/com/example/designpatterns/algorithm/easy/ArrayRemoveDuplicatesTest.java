package com.example.designpatterns.algorithm.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        int[] input = new int[]{1,1,2};
        int k = ArrayRemoveDuplicates.removeDuplicates(input);
        System.out.println(Arrays.toString(input));
        Assertions.assertEquals(2, k);
    }

    @Test
    void removeDuplicates2() {
        int[] input = new int[]{0,0,1,1,1,2,2,3,3,4};
        int k = ArrayRemoveDuplicates.removeDuplicates(input);
        System.out.println(Arrays.toString(input));
        Assertions.assertEquals(5, k);
    }
}