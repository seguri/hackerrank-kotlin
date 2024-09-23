package name.seguri.java.leetcode._235;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Observations:
 *
 * <ul>
 *   <li>I missed that this was about a BST and implemented a solution for a generic tree
 * </ul>
 */
class Solution {

  /**
   * Given:
   *
   * <ul>
   *   <li>{@code p != q}
   *   <li>All values are unique
   * </ul>
   */
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    return smartSolution(root, p, q);
  }

  public TreeNode mySolution(TreeNode root, TreeNode p, TreeNode q) {
    List<TreeNode> pPath = findPath(root, p);
    List<TreeNode> qPath = findPath(root, q);

    int i = 0;
    while (i < pPath.size() && i < qPath.size() && pPath.get(i) == qPath.get(i)) {
      i++;
    }

    return pPath.get(i - 1);
  }

  public TreeNode smartSolution(TreeNode root, TreeNode p, TreeNode q) {
    while (root != null) {
      if (root.val < p.val && root.val < q.val) {
        root = root.right;
      } else if (root.val > p.val && root.val > q.val) {
        root = root.left;
      } else {
        break;
      }
    }
    return root;
  }

  List<TreeNode> findPath(TreeNode node, TreeNode target) {
    if (node == null) {
      return new ArrayList<>();
    }

    if (node == target) {
      List<TreeNode> terminal = new ArrayList<>();
      terminal.add(node);
      return terminal;
    }

    List<TreeNode> leftPath = findPath(node.left, target);
    if (!leftPath.isEmpty()) {
      leftPath.addFirst(node);
      return leftPath;
    }

    List<TreeNode> rightPath = findPath(node.right, target);
    if (!rightPath.isEmpty()) {
      rightPath.addFirst(node);
      return rightPath;
    }

    return new ArrayList<>();
  }

  TreeNode lowestCommonAncestor(int p, int q, Integer... values) {
    if (values == null || values.length == 0 || values[0] == null) {
      return null;
    }

    TreeNode root = new TreeNode(values[0]);
    TreeNode pNode = null;
    TreeNode qNode = null;
    Queue<Map.Entry<Integer, TreeNode>> queue = new ArrayDeque<>();
    queue.add(Map.entry(0, root));
    while (!queue.isEmpty()) {
      var entry = queue.remove();
      int iLeft = 2 * entry.getKey() + 1;
      int iRight = 2 * entry.getKey() + 2;
      var node = entry.getValue();
      if (node.val == p) {
        pNode = node;
      }
      if (node.val == q) {
        qNode = node;
      }
      if (iLeft < values.length && values[iLeft] != null) {
        node.left = new TreeNode(values[iLeft]);
        queue.add(Map.entry(iLeft, node.left));
      }
      if (iRight < values.length && values[iRight] != null) {
        node.right = new TreeNode(values[iRight]);
        queue.add(Map.entry(iRight, node.right));
      }
    }

    return lowestCommonAncestor(root, pNode, qNode);
  }
}
