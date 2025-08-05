package com.example.designpatterns.algorithm.easy;

public class ArrayMoveZeros {
    public static void moveZeroes(int[] nums) {
        int p = 0;  //index to swap
        for  (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (nums[p] == 0){
                    int temp = nums[i];
                    nums[i] = nums[p];
                    nums[p] = temp;
                }
                p++;
            }
        }
    }
}
