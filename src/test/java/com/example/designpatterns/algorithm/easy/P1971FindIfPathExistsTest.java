package com.example.designpatterns.algorithm.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P1971FindIfPathExistsTest {

    @Test
    void validPath() {
        int n = 10;
        int[][] edges = new int[][]{{4,3},{1,4},{4,8},{1,7},{6,4},{4,2},{7,4},{4,0},{0,9},{5,4}};
        int source = 5;
        int destination = 9;

        Assertions.assertTrue(P1971FindIfPathExists.validPath(n, edges, source, destination));
    }
}