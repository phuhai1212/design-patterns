package com.example.designpatterns.algorithm.medium;

public class P3537SpecialGrid {
    public int[][] specialGrid(int n) {
        if (n == 0){
            return new int[1][1];
        }
        return divideAndConquer(n, 0);
    }

    private int[][] divideAndConquer(int n, int seek){
        if (n == 1){
            return baseCase(seek);
        }
        int ratio = (int) Math.pow(2, 2*(n-1));
        int[][] topRight = divideAndConquer(n - 1, seek);
        int[][] botRight = divideAndConquer(n - 1, seek + ratio);
        int[][] botLeft = divideAndConquer(n - 1, seek + 2*ratio);
        int[][] topLeft = divideAndConquer(n - 1, seek + 3*ratio);
        return combine(n, topLeft, topRight, botLeft, botRight);
    }

    private int[][] combine(int n, int[][] topLeft,  int[][] topRight,  int[][] botLeft,  int[][] botRight){
        int length = (int) Math.pow(2, n);
        int[][] dp = new int[length][length];
        for (int row = 0; row < length/2; row++){
            System.arraycopy(topLeft[row], 0, dp[row], 0, length/2);
            System.arraycopy(topRight[row], 0, dp[row], length/2, length/2);
            System.arraycopy(botLeft[row], 0, dp[row + length/2], 0, length/2);
            System.arraycopy(botRight[row], 0, dp[row + length/2], length/2, length/2);
        }
        return dp;
    }

    private int[][] baseCase(int seek){
        int[][] dp = new int[2][2];
        dp[0][0] = seek + 3;
        dp[0][1] = seek;
        dp[1][0] = seek + 2;
        dp[1][1] = seek + 1;
        return dp;
    }
}
