package com.example.designpatterns.algorithm.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0952LargestComponentSizeByCommonFactorTest {

    @Test
    void largestComponentSize() {
        int[] nums = {4,6,15,35};
        Assertions.assertEquals(4, P0952LargestComponentSizeByCommonFactor.largestComponentSize(nums));
    }

    @Test
    void largestComponentSize2() {
        int[] nums = {20,50,9,63};
        Assertions.assertEquals(2, P0952LargestComponentSizeByCommonFactor.largestComponentSize(nums));
    }

    @Test
    void largestComponentSize3() {
        int[] nums = {2,3,6,7,4,12,21,39};
        Assertions.assertEquals(8, P0952LargestComponentSizeByCommonFactor.largestComponentSize(nums));
    }
}