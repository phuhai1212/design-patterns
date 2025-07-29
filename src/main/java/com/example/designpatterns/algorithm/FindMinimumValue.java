package com.example.designpatterns.algorithm;

public class FindMinimumValue {
    public int findMinWithMinimumStep(int[] input){
        int pL = 0;
        int pH = input.length - 1;

        while (pL < pH){
            int mid = (pL + pH)/2;
            if (input[mid] > input[mid + 1]){
                pL = mid + 1;
            } else {
                pH = mid;
            }
        }
        return input[pL];
    }

}
