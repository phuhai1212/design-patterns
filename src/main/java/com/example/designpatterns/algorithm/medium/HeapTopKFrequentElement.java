package com.example.designpatterns.algorithm.medium;

import java.util.*;

public class HeapTopKFrequentElement {
    public static int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((a,b) -> Integer.compare(b[0], a[0]));
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            maxHeap.add(new int[]{entry.getValue(), entry.getKey()});
        }
        int resultLength = Math.min(k, maxHeap.size());
        int[] result = new int[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = maxHeap.poll()[1];
        }
        return result;
    }
}
