package com.example.designpatterns.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntegerToRomanTest {

    @Test
    void convertIntegerToRoman_3749_MMMDCCXLIX() {
        //given
        int n = 3749;
        //when
        String result = IntegerToRoman.convertIntegerToRoman(n);
        //then
        Assertions.assertEquals("MMMDCCXLIX", result);
    }

    @Test
    void convertIntegerToRoman_58_LVIII() {
        //given
        int n = 58;
        //when
        String result = IntegerToRoman.convertIntegerToRoman(n);
        //then
        Assertions.assertEquals("LVIII", result);
    }

    @Test
    void convertIntegerToRoman_1994_MCMXCIV() {
        //given
        int n = 1994;
        //when
        String result = IntegerToRoman.convertIntegerToRoman(n);
        //then
        Assertions.assertEquals("MCMXCIV", result);
    }

    @Test
    void convertIntegerToRoman_2100_MMC() {
        //given
        int n = 2100;
        //when
        String result = IntegerToRoman.convertIntegerToRoman(n);
        //then
        Assertions.assertEquals("MMC", result);
    }
}