package com.example.designpatterns.algorithm;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] solveTwoSum(int[] nums, int target){
        Map<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (temp.get(target - nums[i]) != null) {
                return new int[]{i, temp.get(target - nums[i])};
            } else {
                temp.put(nums[i], i);
            }
        }
        return new int[]{0, 0};
    }
}
