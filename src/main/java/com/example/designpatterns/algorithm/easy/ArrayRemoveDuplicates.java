package com.example.designpatterns.algorithm.easy;

public class ArrayRemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        if (nums.length == 1){
            return k;
        }
        int t = nums[0];
        int p1 = 0;
        for (int p2 = 1; p2 < nums.length; p2++){
            if (nums[p2] != t) {
                p1++;
                nums[p1] = nums[p2];
                t = nums[p2];
                k++;
            }
        }
        return k;
    }
}
