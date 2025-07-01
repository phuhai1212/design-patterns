package com.example.designpatterns.algorithm.easy;

public class ArrayMaxStockBenefit {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length == 1){
            return profit;
        }
        for (int i = 0; i < prices.length - 1; i++){
            profit += prices[i+1] > prices[i]? prices[i+1] - prices[i] : 0;
        }
        return profit;
    }
}
