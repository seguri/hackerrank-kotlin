package name.seguri.kotlin.leetcode._20

import kotlin.collections.ArrayDeque

class Solution {
  fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    val bracketPairs = mapOf(')' to '(', ']' to '[', '}' to '{')

    for (c in s) {
      when (c) {
        in "([{" -> stack.addFirst(c)
        in ")]}" -> {
          if (stack.isEmpty() || stack.removeFirst() != bracketPairs[c]) {
            return false
          }
        }
        else -> error("$c: unexpected character")
      }
    }

    return stack.isEmpty()
  }
}
