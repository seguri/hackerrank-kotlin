package name.seguri.java.leetcode._226;

class Solution {
  TreeNode invertTree(TreeNode node) {
    if (node == null) {
      return null;
    }
    TreeNode temp = node.left;
    node.left = node.right;
    node.right = temp;
    invertTree(node.left);
    invertTree(node.right);
    return node;
  }

  TreeNode invertTree(int... values) {
    var root = TreeNode.of(values);
    return invertTree(root);
  }
}
