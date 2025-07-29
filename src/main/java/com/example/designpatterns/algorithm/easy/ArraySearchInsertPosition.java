package com.example.designpatterns.algorithm.easy;

public class ArraySearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        return findPosition(nums, 0, nums.length - 1, target);
    }

    public static int findPosition(int[] nums, int startIndex, int endIndex, int target){
        if (nums[startIndex] == target){
            return startIndex;
        } else if (nums[endIndex] < target){
            return endIndex + 1;
        } else if (nums[startIndex] > target){
            return startIndex;
        }
        int pos = (startIndex + endIndex)/2;
        if (target == nums[pos]){
            return pos;
        } else if (target < nums[pos]){
            if (pos < 1) {
                return 0;
            }
            return findPosition(nums, startIndex, pos - 1, target);
        } else {
            if (pos > nums.length - 1){
                return nums.length;
            }
            return findPosition(nums, pos + 1, endIndex, target);
        }
    }
}
