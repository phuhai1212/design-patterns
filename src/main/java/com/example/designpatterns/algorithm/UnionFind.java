package com.example.designpatterns.algorithm;

import java.util.Arrays;

public class UnionFind {
    private int[] value;

    private int[] size;
    public UnionFind(int number){
        this.size = new int[number];
        this.value = new int[number];
        for (int i = 0; i < number; i++){
            this.value[i] = i;
            this.size[i] = 1;
        }
    }

    private int root(int p){
        int i = p;
        while (this.value[i] != i){
            this.value[i] = this.value[this.value[i]];
            i = this.value[i];
        }
        return i;
    }
    public void union(int p, int q){
        System.out.printf("Union %d -> %d: ", p, q);
        int r1 = root(p);
        int r2 = root(q);
        if (r1 == r2) return;
        if (size[p] >= size[q]){
            this.value[r2] = r1;
            this.size[r1] += size[q];
        } else {
            this.value[r1] = r2;
            this.size[r2] += size[p];
        }

        System.out.println("New array: " + printUnion());
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public String printUnion(){
        return Arrays.toString(this.value);
    }
}
