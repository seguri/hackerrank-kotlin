package name.seguri.kotlin.leetcode._121

class Solution {
  fun maxProfit(prices: IntArray): Int {
    return fold(prices)
  }

  fun fast(prices: IntArray): Int {
    var profit = 0
    var min = Int.MAX_VALUE
    prices.forEach { price ->
      when {
        price < min -> min = price
        price - min > profit -> profit = price - min
      }
    }
    return profit
  }

  fun fold(prices: IntArray): Int {
    val (profit, _) =
      prices.fold(0 to prices.first()) { (profit, min), price ->
        val newMin = minOf(min, price)
        val newProfit = maxOf(profit, price - newMin)
        newProfit to newMin
      }
    return profit
  }
}
