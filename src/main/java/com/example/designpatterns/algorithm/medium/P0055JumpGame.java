package com.example.designpatterns.algorithm.medium;

public class P0055JumpGame {
    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int step = 1;
        boolean check = false;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (check) {
                if (nums[i] < step) {
                    step++;
                } else {
                    check = false;
                    step = 1;
                }
            } else {
                if (nums[i] == 0){
                    step++;
                    check = true;
                }
            }

        }
        return !check;
    }


}
