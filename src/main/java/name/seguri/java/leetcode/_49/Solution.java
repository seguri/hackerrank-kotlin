package name.seguri.java.leetcode._49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> occurrences = new HashMap<>();

    for (String s : strs) {
      var sortedString = sort(s);
      occurrences.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(s);
    }

    return new ArrayList<>(occurrences.values());
  }

  private String sort(String s) {
    var chars = s.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }
}
