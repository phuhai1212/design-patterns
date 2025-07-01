package com.example.designpatterns.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayMinOfMaxSubArray {
    public static List<Integer> solve(List<Integer> arr, List<Integer> queries) {
        // Write your code here
        //5 2 1 4 3 6 8 1 2 5
        //521-214-143-436-368-681-812-125 5-4-4-6-8-8-8-5         5 4 6 8 8 8 8
        // 5-4-4-6-8-8-8-5                5-2-4-4-6-8-8-2-5       5-4-6-8-8-8-8 5-4-6-8-8-8-8         max(d) = max(2)(max(d-1))
        // 4                              2                       4
        return queries.stream().map(q -> solveOne(arr, q)).collect(Collectors.toList());

        //max(d) = max(3)(max(d-2))

        //max(d) = max(i+1)(max(d-i)), i >= 0
    }

    public static List<Integer> solveV2(List<Integer> arr, List<Integer> queries) {
        int n = arr.size();
        List<Integer> outputs = new ArrayList<>();
        for (int d : queries) {
            int min = Integer.MAX_VALUE;
            int last = -1;
            for (int i = 0; i < n - d + 1; i++) {
                if (i <= last) continue;
                int max = Integer.MIN_VALUE;
                for (int j = i; j < i + d; j++) {
                    if (arr.get(j) > max) {
                        max = arr.get(j);
                        last = j;
                    }
                }
                if (max < min) min = max;
            }
            outputs.add(min);
        }
        return outputs;
    }

    private static int solveOne(List<Integer> arr, int d){
        int min = Integer.MAX_VALUE;
        int pmax = -1;
        for (int i = 0; i < arr.size() - d + 1; i++) {
            if (i <= pmax) continue;
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + d; j++) {
                if (arr.get(j) > max) {
                    max = arr.get(j);
                    pmax = j;
                }
            }
            if (max < min) min = max;
        }
        return min;
    }

}
