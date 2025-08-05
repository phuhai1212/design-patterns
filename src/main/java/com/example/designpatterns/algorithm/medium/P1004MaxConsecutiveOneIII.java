package com.example.designpatterns.algorithm.medium;

import java.util.Arrays;
import java.util.Stack;

public class P1004MaxConsecutiveOneIII {
    static int maxCon = 0;
    public static int longestOnes(int[] nums, int k) {
        int[] pos = new int[nums.length];
        int j = 0;
        int count = 0;
        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                pos[i] = 0;
                count = 0;
                countZero++;
            } else if (i >= j){
                count++;
                j = i + 1;
                while (j < nums.length && nums[j] == 1) {
                    j++;
                    count++;
                }
                pos[i] = count;
            } else {
                pos[i] = count;
            }
        }
        solve(pos, k, maxArray(pos), countZero);
        return maxCon;
    }

    private static int maxArray(int[] nums){
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static void solve(int[] nums, int k, int maxResult, int zeroLeft) {
        if (k == 0 || zeroLeft == 0) {
            maxCon = Math.max(maxCon, maxResult);
            return;
        }
        if (nums.length == 1){
            maxCon = Math.max(maxCon, 1);
            return;
        }
        int max = nums[0];
        Stack<Integer> optStack = new Stack<>();
        optStack.push(0);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                continue;
            }
            int temp;
            if (i == 0) {
                temp = nums[i + 1];
            } else if (i == nums.length - 1) {
                temp = nums[i - 1];
            } else {
                temp = nums[i - 1] + nums[i + 1];
            }
            if (temp > max) {
                optStack.clear();
                optStack.push(i);
                max = temp;
            } else if (temp == max) {
                optStack.push(i);
            }
        }

        while (!optStack.isEmpty()) {
            int pos = optStack.pop();
            //Fill 1 to this pos
            nums[pos] = max + 1;

            int left = pos - 1;
            int numLeft = left >= 0 ? nums[left] : 0;
            while (left >= 0 && nums[left] > 0) {
                nums[left] = max + 1;
                left--;
            }
            int right = pos + 1;
            int numRight = right < nums.length ? nums[right] : 0;
            while (right < nums.length && nums[right] > 0) {
                nums[right] = max + 1;
                right++;
            }

            solve(nums, k -1, max + 1, zeroLeft - 1);

            //Roll back
            nums[pos] = 0;

            for (int i = left + 1; i < pos; i++) {
                nums[i] = numLeft;
            }
            for (int i = right - 1; i > pos; i--) {
                nums[i] = numRight;
            }

        }

    }

}
