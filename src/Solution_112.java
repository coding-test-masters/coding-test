import java.util.Stack;

class Solution_112 {

  public boolean hasPathSum(TreeNode root, int targetSum) {

    if (root == null) {
      return false;
    }

    Stack<Node> stack = new Stack<>();
    Node start = new Node(root, root.val);
    stack.push(start);

    while (!stack.isEmpty()) {
      Node cur = stack.pop();

      if (cur.treeNode.left == null && cur.treeNode.right == null && cur.sum == targetSum) {
        return true;
      }

      if (cur.treeNode.left != null) {
        Node left = new Node(cur.treeNode.left, cur.sum + cur.treeNode.left.val);
        stack.push(left);
      }

      if (cur.treeNode.right != null) {
        Node right = new Node(cur.treeNode.right, cur.sum + cur.treeNode.right.val);
        stack.push(right);
      }
    }

    return false;
  }

  public class Node {

    TreeNode treeNode;
    int sum;

    Node() {

    }

    Node(TreeNode treeNode, int sum) {

      this.treeNode = treeNode;
      this.sum = sum;
    }
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