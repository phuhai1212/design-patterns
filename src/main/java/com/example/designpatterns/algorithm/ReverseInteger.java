package com.example.designpatterns.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ReverseInteger {

    public static int reverseInteger(int n){
        return reverseIntegerUsingString(n);
    }

    public static int reverseIntegerUsingString(int n){
        return Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
    }

    public static int reverseIntegerNotUsingString(int n){
        List<Integer> digits = splitDigits(n);
        int result = 0;
        for (int i = digits.size() - 1; i >= 0; i--){
            result += (int) (digits.get(i) * Math.pow(10, (digits.size() - 1 - i)));
        }
        return result;
    }

    public static List<Integer> splitDigits(int n){
        List<Integer> result = new ArrayList<>();
        while (n > 0){
            result.add(n % 10);
            n = n/10;
        }
        return result;
    }
}
