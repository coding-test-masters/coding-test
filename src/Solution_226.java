import java.util.LinkedList;
import java.util.Queue;

public class Solution_226 {

  public TreeNode invertTree(TreeNode root) {

    if (root == null) {
      return null;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    TreeNode result = new TreeNode();
    queue.offer(root);
    queue.offer(result);

    while (!queue.isEmpty()) {
      TreeNode cur = queue.poll();
      TreeNode pointer = queue.poll();
      pointer.val = cur.val;

      if (cur.left != null) {
        queue.offer(cur.left);
        pointer.right = new TreeNode();
        queue.offer(pointer.right);
      }

      if (cur.right != null) {
        queue.offer(cur.right);
        pointer.left = new TreeNode();
        queue.offer(pointer.left);
      }
    }

    return result;
  }

  public static void main(String[] args) {

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