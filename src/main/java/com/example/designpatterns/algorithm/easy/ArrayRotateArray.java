package com.example.designpatterns.algorithm.easy;

import java.util.Arrays;

public class ArrayRotateArray {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0 || nums.length == 1) return;

        int[] temp = new int[nums.length - k];

        System.arraycopy(nums, 0, temp, 0, nums.length - k);
        System.arraycopy(nums, nums.length - k, nums, 0, k);
        System.arraycopy(temp, 0, nums, k, nums.length - k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateV2(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0 || nums.length == 1) return;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int left, int right){
        while (left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
