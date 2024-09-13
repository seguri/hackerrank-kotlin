package leetcode._1

/**
 * Compared to the Java version:
 * - In this one loop version, the complement's index is always smaller than the current index
 * - No need to store a list of indices; getting the complement's index is enough
 */
class Solution {

  fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    nums.forEachIndexed { i, num ->
      map[num]?.let {
        return intArrayOf(it, i)
      }
      map[target - num] = i
    }
    throw IllegalArgumentException("Input is supposed to always have a solution")
  }
}
