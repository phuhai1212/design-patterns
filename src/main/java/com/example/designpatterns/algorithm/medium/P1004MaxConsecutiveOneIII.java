package com.example.designpatterns.algorithm.medium;

import java.util.*;

public class P1004MaxConsecutiveOneIII {

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                k--;  // use one flip
            }

            while (k < 0) { // too many zeros, shrink window
                if (nums[left] == 0) {
                    k++;  // return one flip
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }


}
