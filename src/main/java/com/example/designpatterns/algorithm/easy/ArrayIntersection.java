package com.example.designpatterns.algorithm.easy;

import java.util.*;

public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        return findIntersectV2(nums2, nums1);
    }

    private static int[] findIntersectV2(int[] nums1, int[] nums2){
        Map<Integer, Integer> nums2Map = new HashMap<>();
        for (int num : nums2){
            nums2Map.merge(num, 1, Integer::sum);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : nums1){
            if (nums2Map.get(num) != null){
                result.add(num);
                if (nums2Map.get(num) == 1){
                    nums2Map.remove(num);
                } else {
                    nums2Map.put(num, nums2Map.get(num) - 1);
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    private static int[] findIntersectV1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1 = 0; int p2 = 0; int k = 0;

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]){
                nums1[k] = nums1[p1];
                p1++;
                p2++;
                k++;
            } else if (nums1[p1] < nums2[p2]){
                p1++;
            } else {
                p2++;
            }
        }

        return Arrays.copyOf(nums1, k);
    }

    private static int findMaxIntersect(int[] nums1, int p1, int[] nums2, int p2){
        int result = 1;
        boolean isStopped = false;
        while (p1 < nums1.length && p2 < nums2.length && !isStopped){
            if (nums1[p1] == nums2[p2]){
                p1++;
                p2++;
                result++;
            } else {
                isStopped = true;
            }
        }
        return result;
    }
}
