import java.util.LinkedList;
import java.util.Queue;

class Solution_222 {

  public int countNodes(TreeNode root) {

    if (root == null) {
      return 0;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    int count = 0;
    queue.offer(root);

    while (!queue.isEmpty()) {
      TreeNode cur = queue.poll();
      count++;

      if (cur.left != null) {
        queue.offer(cur.left);
      }

      if (cur.right != null) {
        queue.offer(cur.right);
      }
    }

    return count;
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