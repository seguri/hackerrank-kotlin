package name.seguri.java.leetcode._152;

import java.util.Arrays;

/**
 * Given an integer array nums, find a subarray that has the largest product, and return the
 * product.
 *
 * <p>The product of any subarray fits the `int` type.
 *
 * <p>Caveats:
 * <li>Find subarrays that do not contain zero
 * <li>The product of two negative numbers is positive and could be the largest
 *
 *     <p>See {@link name.seguri.kotlin.leetcode._152.Solution} for the improved algorithm.
 */
class Solution {

  int maxProduct(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0];
    }

    // Output
    int largest = 0;

    // The current subarray
    int startInclusive = 0;
    int endExclusive = 1;

    // While the subarray is inside the array
    while (endExclusive <= nums.length) {
      // Calculate the product of the subarray and compare
      var product = product(nums, startInclusive, endExclusive);
      largest = Math.max(product, largest);
      // Debug
      System.out.printf(
          "startInclusive=%d endInclusive=%d product=%d largest=%d subarray=%s%n",
          startInclusive,
          endExclusive,
          product,
          largest,
          Arrays.toString(Arrays.copyOfRange(nums, startInclusive, endExclusive)));

      // Start with a new subarray after the zero
      if (nums[startInclusive] == 0) {
        startInclusive++;
        endExclusive = startInclusive + 1;
      }
      // Expand right if next element is not a zero
      else if (endExclusive < nums.length && nums[endExclusive] != 0) {
        endExclusive++;
      }
      // Shrink left
      else if (endExclusive - startInclusive > 1) {
        startInclusive++;
      }
      // Continue after the zero
      else {
        startInclusive = endExclusive;
        endExclusive++;
      }
    }

    return largest;
  }

  int product(int[] array, int startInclusive, int endExclusive) {
    return Arrays.stream(array, startInclusive, endExclusive).reduce(1, (acc, cur) -> acc * cur);
  }
}
