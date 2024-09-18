package name.seguri.java.leetcode._242;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Arrays;
import java.util.Map;

class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    return occurrenceArray(s, t);
  }

  /** Counts the occurrences of each char in each string, and compares the occurrences */
  public boolean occurrenceMaps(String s, String t) {
    Map<Character, Long> sCount =
        s.chars().mapToObj(i -> (char) i).collect(groupingBy(identity(), counting()));
    Map<Character, Long> tCount =
        t.chars().mapToObj(i -> (char) i).collect(groupingBy(identity(), counting()));
    return sCount.equals(tCount);
  }

  /** Counts the occurrences by using a counter for each char */
  public boolean occurrenceArray(String s, String t) {
    var count = new int[26];
    s.chars().mapToObj(i -> (char) i).forEach(c -> count[c - 'a']++);
    t.chars().mapToObj(i -> (char) i).forEach(c -> count[c - 'a']--);
    return Arrays.stream(count).noneMatch(i -> i != 0);
  }
}
