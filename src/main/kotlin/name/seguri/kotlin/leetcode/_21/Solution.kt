package name.seguri.kotlin.leetcode._21

class Solution {
  fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val head = ListNode(-1)
    var tail = head
    var cur1 = list1
    var cur2 = list2

    while (cur1 != null && cur2 != null) {
      if (cur1.`val` <= cur2.`val`) {
        tail.next = cur1
        cur1 = cur1.next
      } else {
        tail.next = cur2
        cur2 = cur2.next
      }
      tail = tail.next!! // This value is not null because of the loop condition
    }

    tail.next = cur1 ?: cur2

    return head.next
  }
}
