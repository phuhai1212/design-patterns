package com.example.designpatterns.algorithm.hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P0952LargestComponentSize {
    public static int largestComponentSize(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        UnionFind uf = new UnionFind(max + 1);

        for (int num : nums) {
            for (int factor = 2; factor * factor <= num; factor++) {
                if (num % factor == 0) {
                    uf.union(num, factor);
                    uf.union(num, num / factor);
                }
            }
        }

        Map<Integer, Integer> count = new HashMap<>();
        int maxSize = 0;

        for (int num : nums) {
            int root = uf.find(num);
            count.put(root, count.getOrDefault(root, 0) + 1);
            maxSize = Math.max(maxSize, count.get(root));
        }

        return maxSize;
    }

    private static long gcd(long a, long b) {
        return b == 0? a : gcd(b, a % b);
    }

    public static class UnionFind {
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

            if(rank[r1] < rank[r2]) {
                parent[r1] = r2;
                rank[r2] += rank[r1];
            } else {
                parent[r2] = r1;
                rank[r1] += rank[r2];
            }
        }
    }
}
