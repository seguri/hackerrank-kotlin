package name.seguri.java.leetcode._110;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }

  /** Builds a tree from a level-ordered array */
  static TreeNode of(Integer... values) {
    return of(0, values);
  }

  private static TreeNode of(int i, Integer... values) {
    if (values == null || values.length == 0 || i >= values.length || values[i] == null) {
      return null;
    }

    var node = new TreeNode(values[i]);
    node.left = of(2 * i + 1, values);
    node.right = of(2 * i + 2, values);
    return node;
  }
}
