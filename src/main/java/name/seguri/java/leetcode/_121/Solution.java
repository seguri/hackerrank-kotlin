package name.seguri.java.leetcode._121;

import java.util.Arrays;

class Solution {
  public int maxProfit(int[] prices) {
    return fold(prices);
  }

  private int bruteforce(int[] prices) {
    int profit = 0;
    for (int i = 0; i < prices.length; i++) {
      int min = prices[i];
      for (int j = i + 1; j < prices.length; j++) {
        int max = prices[j];
        if (max - min > profit) {
          profit = max - min;
        }
      }
    }
    return profit;
  }

  private int fast(int[] prices) {
    int profit = 0;
    int min = prices[0];
    for (int i = 1; i < prices.length; i++) {
      int price = prices[i];
      if (price < min) {
        min = price;
      } else if (price - min > profit) {
        profit = price - min;
      }
    }
    return profit;
  }

  private int fold(int[] prices) {
    var profit = new int[] {0};
    Arrays.stream(prices)
        .reduce(
            Integer.MAX_VALUE,
            (min, price) -> {
              profit[0] = Math.max(profit[0], price - min);
              return Math.min(min, price);
            });
    return profit[0];
  }
}
