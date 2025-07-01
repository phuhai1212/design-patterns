package com.example.designpatterns.algorithm.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntersectionTest {

    @Test
    void intersect() {
        int[] nums1 = new int[]{4, 9, 5, 4};
        int[] nums2 = new int[]{9, 4, 9, 8, 4, 9, 5};

        int[] expected1 = new int[]{4, 4, 5, 9};
        int[] expected2 = new int[]{9, 4};

        Assertions.assertArrayEquals(expected1, ArrayIntersection.intersect(nums1, nums2));
    }

    @Test
    void intersect1() {
        int[] nums1 = new int[]{1,3,8,9,3};
        int[] nums2 = new int[]{1,0};

        int[] expected1 = new int[]{1};
        int[] expected2 = new int[]{9, 4};

        Assertions.assertArrayEquals(expected1, ArrayIntersection.intersect(nums1, nums2));
    }
}