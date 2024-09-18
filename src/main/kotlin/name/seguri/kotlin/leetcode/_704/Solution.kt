package name.seguri.kotlin.leetcode._704

class Solution {
  fun search(nums: IntArray, target: Int): Int {
    var lo = 0
    var hi = nums.size - 1
    while (lo <= hi) {
      val mid = lo + (hi - lo) / 2
      when {
        target > nums[mid] -> lo = mid + 1
        target < nums[mid] -> hi = mid - 1
        else -> return mid
      }
    }
    return -1
  }
}
