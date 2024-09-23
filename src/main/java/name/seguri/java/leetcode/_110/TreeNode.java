package name.seguri.java.leetcode._110;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringJoiner;
import java.util.function.Consumer;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }

  /** Builds a tree from a level-ordered array */
  static TreeNode of(Integer... values) {
    if (values == null || values.length == 0) {
      return null;
    }

    var root = new TreeNode(values[0]);
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    var i = 1;
    while (!queue.isEmpty()) {
      var curr = queue.remove();

      if (i < values.length && values[i] != null) {
        curr.left = new TreeNode(values[i]);
        queue.add(curr.left);
      }
      i++;

      if (i < values.length && values[i] != null) {
        curr.right = new TreeNode(values[i]);
        queue.add(curr.right);
      }
      i++;
    }

    return root;
  }

  @Override
  public String toString() {
    var sj = new StringJoiner(", ", "[", "]");
    levelOrderTraversal(this, val -> sj.add(String.valueOf(val)));
    return sj.toString();
  }

  private void levelOrderTraversal(TreeNode root, Consumer<Integer> consumer) {
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      var node = queue.remove();
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
