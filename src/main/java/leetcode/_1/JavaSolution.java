package leetcode._1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * See the {@link Solution Kotlin version} for a shorter solution.
 *
 * <p>Observations:
 *
 * <ul>
 *   <li><code>nums</code> can contain duplicates
 *   <li>the problem is easy if you implement two nested loops with a triangular pattern (nested
 *       index j starting from i)
 * </ul>
 */
class JavaSolution {

  /** O(n) solution */
  public int[] twoSum(int[] nums, int target) {
    // Store the indices of each value (the same value might appear more than once)
    Map<Integer, List<Integer>> indicesByValue = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      indicesByValue.computeIfAbsent(nums[i], ignored -> new ArrayList<>());
      indicesByValue.get(nums[i]).add(i);
    }

    // Loop through the array and search the complement in the map
    for (int i = 0; i < nums.length; i++) {
      var left = nums[i];
      var right = target - left;
      // Look for a duplicate (there must be two indices for the same value)
      if (left == right) {
        if (indicesByValue.get(left).size() == 2) {
          return indicesByValue.get(left).stream().sorted().mapToInt(Integer::intValue).toArray();
        }
      }
      // Otherwise look for the complement's index
      else if (indicesByValue.containsKey(right)) {
        var j = indicesByValue.get(right).getFirst();
        return new int[] {Math.min(i, j), Math.max(i, j)};
      }
    }

    throw new IllegalArgumentException("Input is supposed to always have a solution");
  }
}
