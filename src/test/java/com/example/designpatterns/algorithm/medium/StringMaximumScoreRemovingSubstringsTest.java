package com.example.designpatterns.algorithm.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMaximumScoreRemovingSubstringsTest {
    @Test
    void test1() {
        String input = "babbaa";
        int x = 5;
        int y = 4;
        Assertions.assertEquals(13, StringMaximumScoreRemovingSubstrings.maximumGain(input, x, y));
    }
}