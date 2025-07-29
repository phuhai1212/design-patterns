package com.example.designpatterns.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    private static final Map<Integer, Integer> cost = new HashMap<>();
    public static int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        if (cost.get(n) != null){
            return cost.get(n);
        }
        int c = climbStairs(n -1) + climbStairs(n -2);
        cost.put(n, c);
        return c;
    }

}
