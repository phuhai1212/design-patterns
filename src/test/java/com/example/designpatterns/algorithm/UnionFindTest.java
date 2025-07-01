package com.example.designpatterns.algorithm;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnionFindTest {

    @Test
    void union() {
        //given
        int n = 10;
        UnionFind unionFind = new UnionFind(10);
        System.out.println("Input: " + unionFind.printUnion());
        //when
        unionFind.union(4, 3);
        unionFind.union(3, 8);
        unionFind.union(6, 5);
        unionFind.union(9, 4);
        unionFind.union(2, 1);

        //then
        assertFalse(unionFind.connected(0, 7));
        assertTrue(unionFind.connected(8, 9));

        //when 2
        unionFind.union(5, 0);
        unionFind.union(7, 2);
        unionFind.union(6, 1);
        unionFind.union(1, 0);
        assertTrue(unionFind.connected(0, 7));
    }

    @Test
    @Disabled
    void connected() {
    }
}