package com.example.designpatterns.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ArrayLargestDivisibleSubset {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new ArrayList<>();
        result.add(nums[0]);
        if (nums.length < 2) return result;
        List<Integer> temp = new ArrayList<>();
        int max = 0;
        int count;
        for (int i = 0; i < nums.length; i++){
            temp.clear();
            temp.add(nums[i]);
            count = 1;
            for (int j = i + 1; j < nums.length; j++){
                int k = 0;
                boolean isDiv = true;
                while (k < temp.size() && isDiv){
                    isDiv = isDivisible(nums[j], temp.get(k));
                    k++;
                }
                if (isDiv){
                    temp.add(nums[j]);
                    count++;
                }
            }
            if (count > max){
                max = count;
                result.clear();
                result.addAll(temp);
            }

        }
        return result;
    }

    private static boolean isDivisible(int a, int b){
        return a % b == 0 || b % a == 0;
    }
}
