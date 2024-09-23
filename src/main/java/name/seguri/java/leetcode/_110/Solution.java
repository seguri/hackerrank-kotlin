package name.seguri.java.leetcode._110;

class Solution {
  public boolean isBalanced(TreeNode root) {
    try {
      maxHeight(root);
      return true;
    } catch (UnbalancedSubtreesException e) {
      return false;
    }
  }

  int maxHeight(TreeNode node) {
    if (node == null) {
      return 0;
    }
    var leftHeight = maxHeight(node.left);
    var rightHeight = maxHeight(node.right);
    if (Math.abs(leftHeight - rightHeight) > 1) {
      throw new UnbalancedSubtreesException();
    }
    return 1 + Math.max(leftHeight, rightHeight);
  }

  static class UnbalancedSubtreesException extends RuntimeException {}
}
