package name.seguri.java.leetcode._21;

/**
 * You'll see shorter solutions:
 *
 * <ul>
 *   <li>where `list1` and `list2` are used as cursors themselves as they are not final
 *   <li>where `list1` or `list2` are directly attached to `resultCur` when one of the two becomes
 *       null; smart and correct for leetcode, but using user input like in that in real world
 *       scenarios is not safe
 *   <li>in which no new ListNodes are created; `resultCur` rather stores a reference to the list1
 *       or list2 node with the lowest value
 * </ul>
 */
class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    }
    if (list2 == null) {
      return list1;
    }

    // The first node will be discarded; it's only used to avoid NPE on the first `.next`
    ListNode resultHead = new ListNode();
    ListNode resultCur = resultHead;
    // Separate cursors are mandatory if lists are declared final
    var cur1 = list1;
    var cur2 = list2;
    while (cur1 != null || cur2 != null) {
      int nextValue;
      if (cur1 == null) {
        nextValue = cur2.val;
        cur2 = cur2.next;
      } else if (cur2 == null) {
        nextValue = cur1.val;
        cur1 = cur1.next;
      } else if (cur1.val <= cur2.val) {
        nextValue = cur1.val;
        cur1 = cur1.next;
      } else {
        nextValue = cur2.val;
        cur2 = cur2.next;
      }

      resultCur.next = new ListNode(nextValue);
      resultCur = resultCur.next;
    }

    return resultHead.next;
  }

  ListNode shortVersion(ListNode list1, ListNode list2) {
    ListNode resultHead = new ListNode();
    ListNode resultCur = resultHead;

    while (list1 != null && list2 != null) {
      if (list1.val > list2.val) {
        resultCur.next = list2;
        list2 = list2.next;
      } else {
        resultCur.next = list1;
        list1 = list1.next;
      }
      resultCur = resultCur.next;
    }

    resultCur.next = list1 != null ? list1 : list2;

    return resultHead.next;
  }

  /*
  ListNode businessVersion(ListNode list1, ListNode list2) {
    ListNode resultHead = new ListNode();
    ListNode resultCur = resultHead;

    while (list1 != null && list2 != null) {
      appendSmallestNode(resultCur, list1, list2);
      moveCursorOfListWithSmallestNode(list1, list2);
    }
    appendRemainingNodes(resultCur, list1, list2);

    return resultHead.next;
  }
  */
}
