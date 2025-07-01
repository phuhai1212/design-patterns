package com.example.designpatterns.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void sort() {
        //given
        Random rand = new Random();
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }
        int[] expected = numbers.clone();

        //when
        Sort.sort(numbers);
        Arrays.sort(expected);

        //then
        Assertions.assertArrayEquals(expected, numbers);

    }
}