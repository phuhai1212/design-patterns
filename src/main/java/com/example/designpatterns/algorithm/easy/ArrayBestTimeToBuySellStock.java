package com.example.designpatterns.algorithm.easy;

public class ArrayBestTimeToBuySellStock {
    public static int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(prices[i] - min, maxProfit);
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }
}
