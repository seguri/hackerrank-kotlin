package name.seguri.java.leetcode._141;

class Solution {

  /** Implements "Floyd’s Cycle Finding Algorithm" or "Hare-Tortoise algorithm". */
  public boolean hasCycle(ListNode head) {
    var slow = head;
    var fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (fast == slow) {
        return true;
      }
    }

    return false;
  }
}
