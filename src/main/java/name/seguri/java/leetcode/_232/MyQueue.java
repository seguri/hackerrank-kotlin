package name.seguri.java.leetcode._232;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given:
 *
 * <ul>
 *   <li>You must use only standard operations of a stack, which means {@code push to top}, {@code
 *       peek/pop from top}, {@code size}, and {@code is empty}.
 * </ul>
 *
 * Then:
 *
 * <ul>
 *   <li>There are no tests for this exercise. Implementing the testing engine seems a quite boring
 *       task compared to the simplicity of the solution.
 * </ul>
 */
@SuppressWarnings("unused")
class MyQueue {

  private final Deque<Integer> lastOnTop = new ArrayDeque<>();
  private final Deque<Integer> firstOnTop = new ArrayDeque<>();

  public MyQueue() {}

  public void push(int x) {
    while (!firstOnTop.isEmpty()) {
      lastOnTop.push(firstOnTop.pop());
    }
    lastOnTop.push(x);
  }

  public int pop() {
    while (!lastOnTop.isEmpty()) {
      firstOnTop.push(lastOnTop.pop());
    }

    return firstOnTop.pop();
  }

  public int peek() {
    while (!lastOnTop.isEmpty()) {
      firstOnTop.push(lastOnTop.pop());
    }
    return firstOnTop.peek();
  }

  public boolean empty() {
    return lastOnTop.isEmpty() && firstOnTop.isEmpty();
  }
}
