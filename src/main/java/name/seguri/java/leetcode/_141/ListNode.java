package name.seguri.java.leetcode._141;

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }

  static ListNode of(int loopIndex, int... values) {
    if (values == null || values.length == 0) {
      return null;
    }

    ListNode rootWithExtraHead = new ListNode(-1);
    ListNode curr = rootWithExtraHead;
    ListNode loopNode = null;
    for (int i = 0; i < values.length; i++) {
      curr.next = new ListNode(values[i]);
      if (i == loopIndex) {
        loopNode = curr.next;
      }
      curr = curr.next;
    }

    // Set loop
    curr.next = loopNode;

    return rootWithExtraHead.next;
  }
}
