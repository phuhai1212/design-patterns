package com.example.designpatterns.algorithm.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySingleNumber {
    public static int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }

    public static int singleNumberV2(int[] nums) {
        int result = 0;
        for (int num : nums){
            result ^= num;
        }
        return result;
    }
}
