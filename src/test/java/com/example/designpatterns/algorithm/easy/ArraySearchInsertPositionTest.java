package com.example.designpatterns.algorithm.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySearchInsertPositionTest {

    @Test
    void searchInsert1() {
        int[] nums = new int[]{1,3,5,6};
        int target = 5;
        int expected = 2;
        Assertions.assertEquals(expected, ArraySearchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert2() {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        int expected = 1;
        Assertions.assertEquals(expected, ArraySearchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert3() {
        int[] nums = new int[]{1,3,5,6};
        int target = 7;
        int expected = 4;
        Assertions.assertEquals(expected, ArraySearchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert4() {
        int[] nums = new int[]{1,3,5,6};
        int target = 0;
        int expected = 0;
        Assertions.assertEquals(expected, ArraySearchInsertPosition.searchInsert(nums, target));
    }

    @Test
    void searchInsert5() {
        int[] nums = new int[]{3,5,7,9,10};
        int target = 8;
        int expected = 3;
        Assertions.assertEquals(expected, ArraySearchInsertPosition.searchInsert(nums, target));
    }
}