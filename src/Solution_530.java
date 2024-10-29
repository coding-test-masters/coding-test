class Solution_530 {

  int minDiff = Integer.MAX_VALUE;
  Integer prev = null;

  public int getMinimumDifference(TreeNode root) {

    inOrder(root);
    return minDiff;
  }

  void inOrder(TreeNode node) {

    if (node == null) {
      return;
    }

    inOrder(node.left);

    if (prev != null) {
      minDiff = Math.min(minDiff, node.val - prev);
    }
    prev = node.val;

    inOrder(node.right);
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