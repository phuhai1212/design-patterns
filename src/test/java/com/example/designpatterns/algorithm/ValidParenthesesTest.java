package com.example.designpatterns.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    public enum TestEnum{
        ABC,
        DEF,
        GHI
    }

    public enum TestEnumWithProperties{
        ABC("1", 2),
        DEF("2", 3),
        GHI("3", 4);

        private final String name;
        private final int value;

        TestEnumWithProperties(String number, int i) {
            this.name  = number;
            this.value = i;
        }

        public String getName() {
            return this.name;
        }

        public int getValue(){
            return this.value;
        }
    }

    @Test
    void checkValidParentheses_Valid_True() {
        //given
        String s = "()[]{}";
        //when
        boolean result = ValidParentheses.checkValidParentheses(s);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void checkValidParentheses_Invalid_False() {
        //given
        String s = "()[}]{";
        //when
        boolean result = ValidParentheses.checkValidParentheses(s);
        //then
        Assertions.assertFalse(result);
    }
}