package name.seguri.kotlin.leetcode._226

class Solution {
  fun invertTree(node: TreeNode?): TreeNode? {
    if (node == null) {
      return null
    }
    val temp = node.left
    node.left = node.right
    node.right = temp
    invertTree(node.left)
    invertTree(node.right)
    return node
  }

  fun invertTree(vararg values: Int): TreeNode? {
    var root = TreeNode.of(*values)
    return invertTree(root)
  }
}
