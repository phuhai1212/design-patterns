package com.example.designpatterns.algorithm.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0844BackspaceStringCompareTest {

    @Test
    void backspaceCompare1() {
        String s = "ab#c";
        String t = "ad#c";

        Assertions.assertTrue(P0844BackspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    void backspaceCompare2() {
        String s = "ab##";
        String t = "c#d#";

        Assertions.assertTrue(P0844BackspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    void backspaceCompare3() {
        String s = "a#c";
        String t = "b";

        Assertions.assertFalse(P0844BackspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    void backspaceCompare4() {
        String s = "c##vnvr";
        String t = "#c##vnvr";

        Assertions.assertTrue(P0844BackspaceStringCompare.backspaceCompare(s, t));
    }

    @Test
    void backspaceCompare5() {
        String s = "y#fo##f";
        String t = "y#fx#o##f";

        Assertions.assertTrue(P0844BackspaceStringCompare.backspaceCompare(s, t));
    }
}