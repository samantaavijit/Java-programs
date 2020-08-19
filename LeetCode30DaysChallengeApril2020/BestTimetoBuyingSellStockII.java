package com.avijitsamanta.LeetCode30DaysChallengeApril2020;

public class BestTimetoBuyingSellStockII {

    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++)
            if (prices[i] > prices[i - 1])
                max += prices[i] - prices[i - 1];
        return max;
    }

    public static void main(String[] args) {
        int[] prices = { 1, 2, 3, 4, 5 };
        BestTimetoBuyingSellStockII obj = new BestTimetoBuyingSellStockII();
        System.out.print("Max Profit is " + obj.maxProfit(prices));
    }
}