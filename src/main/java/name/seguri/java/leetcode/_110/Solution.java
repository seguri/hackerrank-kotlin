package name.seguri.java.leetcode._110;

class Solution {
  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }

    return Math.abs(maxHeight(root.left) - maxHeight(root.right)) <= 1;
  }

  int maxHeight(TreeNode node) {
    if (node == null) {
      return 0;
    }

    var maxLeftHeight = 1 + maxHeight(node.left);
    var maxRightHeight = 1 + maxHeight(node.right);

    return Math.max(maxLeftHeight, maxRightHeight);
  }
}
