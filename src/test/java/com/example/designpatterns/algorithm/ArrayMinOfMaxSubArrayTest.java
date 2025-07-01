package com.example.designpatterns.algorithm;

import com.example.designpatterns.algorithm.easy.ArrayMaxStockBenefit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMinOfMaxSubArrayTest {

    @Test
    void solve() {
        List<Integer> arr = List.of(5,2,1,4,3,6,8,1,2,5);
        List<Integer> queries = List.of(3,2,4,5);
        List<Integer> result = ArrayMinOfMaxSubArray.solveV2(arr, queries);
        System.out.println(result);
    }
}