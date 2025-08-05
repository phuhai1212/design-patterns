package com.example.designpatterns.algorithm.medium;

import java.util.HashMap;
import java.util.Map;

public class ArrayMaximumErasureValue {
    public static int maximumUniqueSubarray(int[] nums) {
        Map<Integer, Long> map = new HashMap<>();
        int maxSum = 0;
        int p = 0;
        int sum = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            Long numInfo = map.get(nums[i]);
            if (numInfo == null) {
                sum += nums[i];
            } else {
                int oldTotal = (int) (numInfo >>> 32);
                int oldIndex = (int) numInfo.longValue();
                if (oldIndex < p){
                    sum += nums[i];
                } else {
                    p = oldIndex + 1;
                    sum = total - oldTotal;
                }
            }
            long packed = (((long) total) << 32) | (i & 0xFFFFFFFFL);
            map.put(nums[i], packed);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
