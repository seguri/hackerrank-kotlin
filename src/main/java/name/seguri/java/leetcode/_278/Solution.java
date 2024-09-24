package name.seguri.java.leetcode._278;

/**
 * Given:
 *
 * <ul>
 *   <li>The isBadVersion API is defined in the parent class (I MODIFIED THE CODE TO MAKE IT
 *       TESTABLE)
 *   <li>You should minimize the number of calls to the API
 *   <li>{@code 1 <= bad <= n <= 2^31 - 1}
 * </ul>
 */
class Solution {
  private final VersionControl versionControl;

  Solution(VersionControl versionControl) {
    this.versionControl = versionControl;
  }

  /** This reminds me of git bisect. */
  public int firstBadVersion(int n) {
    return bisect(n);
  }

  int bisect(int n) {
    int first = n;
    int lo = 1;
    int hi = n;
    while (true) {
      int mid = lo + (hi - lo) / 2;
      if (first == mid) {
        return first;
      }
      if (versionControl.isBadVersion(mid)) {
        hi = mid - 1;
        first = mid;
      } else {
        lo = mid + 1;
      }
    }
  }

  @SuppressWarnings("unused")
  int bruteforce(int n) {
    for (int i = 0; i < n; i++) {
      if (versionControl.isBadVersion(i)) {
        return i;
      }
    }
    throw new IllegalStateException("There must always be a solution");
  }
}
