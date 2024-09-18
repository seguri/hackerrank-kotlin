package name.seguri.kotlin.leetcode._242

class Solution {
  fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
      return false
    }

    val sCount = s.groupingBy { it }.eachCount()
    val tCount = t.groupingBy { it }.eachCount()

    return sCount == tCount
  }
}
