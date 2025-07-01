package com.example.designpatterns.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

public class ArrayContainDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        if (nums.length == 1) return false;

        for (int num : nums) {
            if (map.get(num) != null) {
                return true;
            } else {
                map.put(num, true);
            }
        }
        return false;

    }
}
