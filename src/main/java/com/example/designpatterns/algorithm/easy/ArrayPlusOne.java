package com.example.designpatterns.algorithm.easy;

public class ArrayPlusOne {
    public static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9){    //Return for: 1234 -> 1235
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }                                       //Process for: XXX9
        boolean isDiff9 = false;
        int iDiff9 = digits.length - 2;
        while (!isDiff9 && iDiff9 >= 0){
            isDiff9 = digits[iDiff9] != 9;
            if (!isDiff9){
                iDiff9--;
            }
        }
        if (iDiff9 < 0){                        //Return for 9...99 -> 10...00
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        digits[iDiff9] = digits[iDiff9] + 1;    //Return for 1999 -> 2000
        for (int i = iDiff9 + 1; i < digits.length; i++){
            digits[i] = 0;
        }
        return digits;
    }
}
