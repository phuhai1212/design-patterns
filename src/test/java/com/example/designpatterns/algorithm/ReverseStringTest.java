package com.example.designpatterns.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    void reverseString() {
        //given
        String s = "Hello World!";
        //when
        String result = ReverseString.reverseString(s);
        //then
        Assertions.assertEquals("!dlroW olleH", result);
    }
}