package com.example.designpatterns.algorithm.hard;

import java.util.*;

public class P0952LargestComponentSizeByCommonFactor {
    public static int largestComponentSize(int[] nums) {
        UnionFind unionFind = new UnionFind(nums.length);
        Map<Integer, Integer> roots = new HashMap<>();      //<root_index_in_nums, value_for_gcd>
        roots.put(0, nums[0]);
        for (int i = 1; i < nums.length; i++) {
            boolean found = false;
            for (Map.Entry<Integer, Integer> entry : roots.entrySet()) {
                int gcd = gcd(nums[i], entry.getValue());
                if (gcd > 1) {
                    unionFind.union(i, entry.getKey());
                    found = true;
                    if (gcd < nums[i]) {
                        roots.put(entry.getKey(), entry.getValue() * (nums[i]/gcd));
                    }
                }
            }
            if (!found) {
                roots.put(i, nums[i]);
            }
        }

        return Arrays.stream(unionFind.rank).max().orElse(0);
    }

    private static int gcd(int a, int b) {
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
