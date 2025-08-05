package com.example.designpatterns.algorithm.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class P1071GCDStrings {
    public static String gcdOfStrings(String str1, String str2) {
        int gcd = gcd(str1.length(), str2.length());
        String result = str1.substring(0, gcd);
        if (str1.replaceAll(result, "").isEmpty() && str2.replaceAll(result, "").isEmpty()){
            return result;
        }
        return "";
    }

    private static int gcd(int n1, int n2){
        return n2 == 0? n1 : gcd(n2, n1 % n2);
    }
}
