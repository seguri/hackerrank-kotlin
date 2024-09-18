package name.seguri.java.leetcode._704;

class Solution {

  /**
   *
   *
   * <ul>
   *   <li>nums.length > 0
   * </ul>
   */
  public int search(int[] nums, int target) {
    var lo = 0;
    var hi = nums.length - 1;
    while (lo <= hi) {
      var mid = lo + (hi - lo) / 2;
      if (target < nums[mid]) {
        hi = mid - 1;
      } else if (target > nums[mid]) {
        lo = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
