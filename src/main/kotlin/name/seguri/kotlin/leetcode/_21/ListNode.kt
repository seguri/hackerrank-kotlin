package name.seguri.kotlin.leetcode._21

import java.util.StringJoiner

/** I've preferred this over `class ListNode(var `val`: Int, var next: ListNode?)` */
class ListNode(var `val`: Int) {
  var next: ListNode? = null

  companion object {
    fun of(vararg values: Int): ListNode? {
      var curr: ListNode? = null
      for (i in values.indices.reversed()) {
        curr = ListNode(values[i]).apply { next = curr }
      }
      return curr
    }
  }

  override fun toString(): String {
    val sj = StringJoiner(", ", "[", "]")
    var curr: ListNode? = this
    while (curr != null) {
      sj.add(curr.`val`.toString())
      curr = curr.next
    }
    return sj.toString()
  }
}
