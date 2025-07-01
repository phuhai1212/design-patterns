package com.example.designpatterns.algorithm;

public class Sort {
    public static void sort(int[] input){
        insertionSort(input);
    }

    private static void insertionSort(int[] input){
        for (int i = 1; i < input.length; i++){
            int currentValue = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > currentValue){
                input[j+1] = input[j];
                j--;
            }
            input[j+1] = currentValue;
        }
    }
}
