import java.util.LinkedList;
import java.util.Queue;

public class Solution_100 {

  public boolean isSameTree(TreeNode p, TreeNode q) {

    if (p == null && q == null) {
      return true;
    }

    if (p == null ^ q == null) {
      return false;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(p);
    queue.offer(q);

    while (!queue.isEmpty()) {
      TreeNode first = queue.poll();
      TreeNode second = queue.poll();

      if (first.val != second.val) {
        return false;
      }

      if (first.left == null ^ second.left == null) {
        return false;
      }

      if (first.right == null ^ second.right == null) {
        return false;
      }

      if (first.left != null) {
        queue.offer(first.left);
        queue.offer(second.left);
      }

      if (first.right != null) {
        queue.offer(first.right);
        queue.offer(second.right);
      }
    }

    return true;
  }

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {

    }

    TreeNode(int val) {

      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {

      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}