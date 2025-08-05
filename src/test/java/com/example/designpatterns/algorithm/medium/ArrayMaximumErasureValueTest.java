package com.example.designpatterns.algorithm.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaximumErasureValueTest {

    @Test
    void maximumUniqueSubarray1() {
        int[] nums = {4, 2, 4, 5, 6};
        Assertions.assertEquals(17, ArrayMaximumErasureValue.maximumUniqueSubarray(nums));
    }

    @Test
    void maximumUniqueSubarray2() {
        int[] nums = {1, 2, 3, 4, 2, 3, 5};
        Assertions.assertEquals(14, ArrayMaximumErasureValue.maximumUniqueSubarray(nums));
    }

    @Test
    void maximumUniqueSubarray3() {
        int[] nums = {187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,
                965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,
                70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};
        Assertions.assertEquals(16911, ArrayMaximumErasureValue.maximumUniqueSubarray(nums));
    }
}