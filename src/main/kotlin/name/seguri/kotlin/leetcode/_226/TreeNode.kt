package name.seguri.kotlin.leetcode._226

import java.util.ArrayDeque
import java.util.StringJoiner
import java.util.function.Consumer

class TreeNode(var `val`: Int) {
  var left: TreeNode? = null
  var right: TreeNode? = null

  companion object {
    fun of(vararg values: Int): TreeNode? {
      return of(0, values)
    }

    private fun of(index: Int, values: IntArray): TreeNode? {
      if (values.isEmpty() || index >= values.size) {
        return null
      }
      return TreeNode(values[index]).apply {
        left = of(2 * index + 1, values)
        right = of(2 * index + 2, values)
      }
    }
  }

  override fun toString(): String {
    val sj = StringJoiner(", ", "[", "]")
    levelOrderTraversal(this) { sj.add(it.toString()) }
    return sj.toString()
  }

  private fun levelOrderTraversal(root: TreeNode?, consumer: Consumer<Int>) {
    val queue = ArrayDeque<TreeNode>()
    if (root != null) {
      queue.add(root)
    }
    while (queue.isNotEmpty()) {
      val node = queue.pop()
      consumer.accept(node.`val`)
      node.left?.let { queue.add(it) }
      node.right?.let { queue.add(it) }
    }
  }
}
