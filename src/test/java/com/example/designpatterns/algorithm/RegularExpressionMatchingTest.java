package com.example.designpatterns.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    @Test
    void testExample1() {
        //given
        String s = "aa";
        String p = "a";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertFalse(match);
    }

    @Test
    void testExample2() {
        //given
        String s = "aa";
        String p = "a*";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertTrue(match);
    }

    @Test
    void testExample3() {
        //given
        String s = "ab";
        String p = ".*";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertTrue(match);
    }

    @Test
    void testExample4() {
        //given
        String s = "aab";
        String p = "c*a*b";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertTrue(match);
    }

    @Test
    void testExample5() {
        //given
        String s = "aab";
        String p = "c.a*b";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertFalse(match);
    }

    @Test
    void testExample6() {
        //given
        String s = "mississippi";
        String p = "mis*is*p*.";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertFalse(match);
    }

    @Test
    void testExample7() {
        //given
        String s = "mississippi";
        String p = "mis*is*ip*.";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertTrue(match);
    }

    @Test
    void testExample8() {
        //given
        String s = "ab";
        String p = ".*c";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertFalse(match);
    }

    @Test
    void testExample9() {
        //given
        String s = "aaa";
        String p = "aaaa";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertFalse(match);
    }

    @Test
    void testExample10() {
        //given
        String s = "aaa";
        String p = "ab*a";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertFalse(match);
    }

    @Test
    void testExample11() {
        //given
        String s = "aaa";
        String p = "ab*ac*a";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertTrue(match);
    }

    @Test
    void testExample12() {
        //given
        String s = "a";
        String p = "ab*";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertTrue(match);
    }

    @Test
    void testExample13() {
        //given
        String s = "bbbba";
        String p = ".*a*a";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertTrue(match);
    }

    @Test
    void testExample14() {
        //given
        String s = "aaba";
        String p = "ab*a*c*a";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertFalse(match);
    }

    @Test
    void testExample15() {
        //given
        String s = "abbabaaaaaaacaa";
        String p = "a*.*b.a.*c*b*a*c*";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertTrue(match);
    }

    @Test
    void testExample16() {
        //given
        String s = "abcaaaaaaabaabcabac";
        String p = ".*ab.a.*a*a*.*b*b*";
        //when
        boolean match = RegularExpressionMatching.isMatch(s, p);

        //then
        Assertions.assertTrue(match);
    }
}