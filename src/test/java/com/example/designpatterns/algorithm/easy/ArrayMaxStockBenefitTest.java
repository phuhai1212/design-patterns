package com.example.designpatterns.algorithm.easy;

import com.example.designpatterns.algorithm.ArrayLargestDivisibleSubset;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaxStockBenefitTest {

    @Test
    void maxProfit1() {
        int[] input = new int[]{7,1,5,3,6,4};
        int k = ArrayMaxStockBenefit.maxProfit(input);
        Assertions.assertEquals(7, k);
    }

    @Test
    void maxProfit2() {
        int[] input = new int[]{1,2,3,4,5};
        int k = ArrayMaxStockBenefit.maxProfit(input);
        Assertions.assertEquals(4, k);
    }

    @Test
    void maxProfit3() {
        int[] input = new int[]{7,6,4,3,1};
        int k = ArrayMaxStockBenefit.maxProfit(input);
        Assertions.assertEquals(0, k);
    }
}