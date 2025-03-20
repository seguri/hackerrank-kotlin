package name.seguri.kotlin.leetcode._152

/**
 * I haven't seen anybody anywhere explaining WHY we should keep track of both the max and the min.
 * Kadane's algorithm is probably relevant to this, but I haven't studied it.
 *
 * ## See also:
 * - [Neetcode](https://www.youtube.com/watch?v=lXVy6YWFcRM)
 * - [Maximum subarray problem](https://en.wikipedia.org/wiki/Maximum_subarray_problem)
 */
class Solution {
  fun maxProduct(nums: IntArray): Int {
    if (nums.isEmpty()) {
      return 0
    }

    var res = nums[0]
    var min = 1
    var max = 1

    for (n in nums) {
      // When `n==0`, max and min get reset to zero.
      // In the next iteration, `maxOf(n*0, n*0, n)` "restarts" the algorithm.
      val newMax = maxOf(n * max, n * min, n)
      val newMin = minOf(n * max, n * min, n)

      max = newMax
      min = newMin
      res = maxOf(res, max)
    }

    return res
  }
}
