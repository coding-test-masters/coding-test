import java.util.LinkedList;
import java.util.Queue;

public class Solution_101 {

  public boolean isSymmetric(TreeNode root) {

    Queue<TreeNode> leftQ = new LinkedList<>();
    Queue<TreeNode> rightQ = new LinkedList<>();

    leftQ.offer(root);
    rightQ.offer(root);

    while (!leftQ.isEmpty() && !rightQ.isEmpty()) {
      TreeNode leftCur = leftQ.poll();
      TreeNode rightCur = rightQ.poll();

      if (leftCur.val != rightCur.val) {
        return false;
      }

      if (leftCur.left != null && rightCur.right != null) {
        leftQ.offer(leftCur.left);
        rightQ.offer(rightCur.right);
      } else if (leftCur.left == null ^ rightCur.right == null) {
        return false;
      }

      if (leftCur.right != null && rightCur.left != null) {
        leftQ.offer(leftCur.right);
        rightQ.offer(rightCur.left);
      } else if (leftCur.right == null ^ rightCur.left == null) {
        return false;
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