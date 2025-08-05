package com.example.designpatterns.algorithm.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1071GCDStringsTest {

    @Test
    void gcdOfStrings() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        Assertions.assertEquals("ABC", P1071GCDStrings.gcdOfStrings(str1, str2));
    }
    @Test
    void gcdOfStrings2() {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        Assertions.assertEquals("AB", P1071GCDStrings.gcdOfStrings(str1, str2));
    }

}