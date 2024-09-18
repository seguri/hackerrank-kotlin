package name.seguri.java.leetcode._226;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;
import java.util.function.Consumer;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  /** Reads values as level-ordered */
  static TreeNode of(int... values) {
    return of(0, values);
  }

  private static TreeNode of(int index, int[] values) {
    if (values == null || values.length == 0 || index >= values.length) {
      return null;
    }
    return new TreeNode(values[index], of(2 * index + 1, values), of(2 * index + 2, values));
  }

  @Override
  public String toString() {
    var sj = new StringJoiner(", ", "[", "]");
    levelOrderTraversal(this, val -> sj.add(String.valueOf(val)));
    return sj.toString();
  }

  private void levelOrderTraversal(TreeNode root, Consumer<Integer> consumer) {
    Deque<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      var node = queue.pop();
      consumer.accept(node.val);
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
  }
}
