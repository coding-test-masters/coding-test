import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution_637 {

  public List<Double> averageOfLevels(TreeNode root) {

    List<Double> result = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      int size = queue.size();
      double sum = 0;

      for (int i = 0; i < size; i++) {
        TreeNode cur = queue.poll();
        sum += cur.val;

        if (cur.left != null) {
          queue.add(cur.left);
        }
        if (cur.right != null) {
          queue.add(cur.right);
        }
      }

      result.add(sum / size);
    }

    return result;
  }

  public class Node {

    TreeNode treeNode;
    int level;

    Node(TreeNode treeNode, int level) {

      this.treeNode = treeNode;
      this.level = level;
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