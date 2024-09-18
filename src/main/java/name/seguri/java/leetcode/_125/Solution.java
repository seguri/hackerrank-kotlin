package name.seguri.java.leetcode._125;

class Solution {
  public boolean isPalindrome(String s) {
    var left = 0;
    var right = s.length() - 1;
    while (left < right) {
      if (!Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      } else if (!Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      } else {
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
          return false;
        }
        left++;
        right--;
      }
    }

    return true;
  }
}
