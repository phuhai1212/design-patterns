package com.example.designpatterns.algorithm;

public class UnionFind {
    int[] parent;
    int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int p) {
        if (p != parent[p]) {
            parent[p] = find(parent[p]);
        }
        return parent[p];
    }

    public void union(int p, int q) {
        int r1 = find(p);
        int r2 = find(q);
        if (r1 == r2) return;
        if (rank[r1] < rank[r2]) {
            parent[r1] = r2;
            rank[r2] += rank[r1];
        } else {
            parent[r2] = r1;
            rank[r1] += rank[r2];
        }
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
}
