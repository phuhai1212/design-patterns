package com.example.designpatterns.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    @Test
    void minCostClimbingStairsTestCase1() {
        //given
        int[] cost = new int[]{10, 15, 20};
        //when
        int result = MinCostClimbingStairs.minCostClimbingStairs(cost);
        //then
        Assertions.assertEquals(15, result);
    }
    @Test
    void minCostClimbingStairsTestCase2() {
        //given
        int[] cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        //when
        int result = MinCostClimbingStairs.minCostClimbingStairs(cost);
        //then
        Assertions.assertEquals(6, result);
    }
}