package name.seguri.java.leetcode._21;

import java.util.StringJoiner;

/** An empty list is represented by a null node. */
class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  /**
   * Build the nodes from the tail. If you start from the head, you need to keep two references, one
   * for the head and one for the current node.
   */
  public static ListNode of(int... values) {
    ListNode curr = null;
    for (int i = values.length - 1; i >= 0; i--) {
      curr = new ListNode(values[i], curr);
    }
    return curr;
  }

  @Override
  public String toString() {
    var sj = new StringJoiner(", ", "[", "]");
    var curr = this;
    while (curr != null) {
      sj.add(String.valueOf(curr.val));
      curr = curr.next;
    }
    return sj.toString();
  }
}
