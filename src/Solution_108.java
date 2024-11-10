class Solution_108 {

  public TreeNode sortedArrayToBST(int[] nums) {

    return recursion(nums, 0, nums.length - 1);
  }

  TreeNode recursion(int[] nums, int left, int right) {

    if (left > right) {
      return null;
    }

    int mid = (left + right) / 2;
    TreeNode cur = new TreeNode(nums[mid]);

    cur.left = recursion(nums, left, mid - 1);
    cur.right = recursion(nums, mid + 1, right);

    return cur;
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