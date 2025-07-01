package com.example.designpatterns.algorithm.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterestingTimePatternsTest {

    @Test
    void solutionTest1() {
        String S = "15:15:00";
        String T = "15:15:12";

        int expected = 1;
        Assertions.assertEquals(expected, InterestingTimePatterns.solution(S, T));
    }

    @Test
    void solutionTest2() {
        String S = "22:22:21";
        String T = "22:22:23";

        int expected = 3;
        Assertions.assertEquals(expected, InterestingTimePatterns.solution(S, T));
    }

    @Test
    void solutionTest3() {
        String S = "00:00:00";
        String T = "23:59:59";

        System.out.println("T3: " + InterestingTimePatterns.solution(S, T));
    }

}