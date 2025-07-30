package com.example.designpatterns.algorithm.hard;

import java.util.HashMap;
import java.util.Map;

public class SuperEggDrop {
    private static Map<String, Integer> memo = new HashMap<>();
    public static int superEggDrop(int k, int n) {
        int m = 0;
        while (solve(k, m) < n){
            m++;
        }
        return m;
    }

    public static int solve(int k, int m){
        if (m == 0 || k == 0){
            return 0;
        }
        String key = k + "_" + m;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int result = solve(k - 1, m - 1) + solve(k, m - 1) + 1;
        memo.put(key, result);
        return result;
    }

}
