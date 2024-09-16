package name.seguri.java.leetcode._20;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
  public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      switch (c) {
        case '(', '[', '{' -> stack.push(c);
        case ')', ']', '}' -> {
          if (stack.isEmpty()) {
            return false;
          }
          char matching = stack.pop();
          if (c == ')' && matching != '(') {
            return false;
          }
          if (c == ']' && matching != '[') {
            return false;
          }
          if (c == '}' && matching != '{') {
            return false;
          }
        }
        default -> throw new IllegalArgumentException(c + ": unexpected value");
      }
    }
    return stack.isEmpty();
  }
}
