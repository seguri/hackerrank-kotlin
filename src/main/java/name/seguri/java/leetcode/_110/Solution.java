package name.seguri.java.leetcode._110;

class Solution {
  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }

    int maxLeftHeight = maxHeight(root.left);
    int maxRightHeight = maxHeight(root.right);
    if (Math.abs(maxLeftHeight - maxRightHeight) > 1) {
      return false;
    }

    return isBalanced(root.left) && isBalanced(root.right);
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
