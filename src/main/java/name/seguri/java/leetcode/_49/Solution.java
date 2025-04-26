package name.seguri.java.leetcode._49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> result = new ArrayList<>();
    Map<String, List<String>> occurrences = new HashMap<>();

    for (String s : strs) {
      var sortedString = sort(s);
      occurrences.putIfAbsent(sortedString, new ArrayList<>());
      occurrences.get(sortedString).add(s);
    }

    for (List<String> strings : occurrences.values()) {
      result.add(strings);
    }

    return result;
  }

  private String sort(String s) {
    var result = new StringBuilder();
    var sortedChars = s.chars().mapToObj(i -> (char) i).sorted().toArray(Character[]::new);
    for (Character c : sortedChars) {
      result.append(c);
    }
    return result.toString();
  }
}
