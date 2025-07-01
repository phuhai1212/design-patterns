package com.example.designpatterns.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MinCostClimbingStairs {
    private final static Map<Integer, Integer> minCost = new HashMap<>();
    public static int minCostClimbingStairs(int[] cost){
        minCost.clear();
        return climbingStairMemorize(cost, cost.length);
    }

    public static int climbingStairMemorize(int[] cost, int target){
        if (target < 2){
            return cost[target];
        }
        if (minCost.get(target) != null){
            return minCost.get(target);
        }
        int c = (target == cost.length? 0 : cost[target]) + Math.min(climbingStairMemorize(cost, target-1), climbingStairMemorize(cost, target - 2));
        minCost.put(target, c);
        return c;
    }
}
