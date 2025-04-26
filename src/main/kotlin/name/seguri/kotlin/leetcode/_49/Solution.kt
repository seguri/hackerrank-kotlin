package name.seguri.kotlin.leetcode._49

class Solution {
  fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val occurrences = mutableMapOf<String, MutableList<String>>()

    for (s in strs) {
      val sortedString = s.toCharArray().sorted().joinToString("")
      occurrences.getOrPut(sortedString) { mutableListOf() }.add(s)
    }

    return occurrences.values.toList()
  }
}
