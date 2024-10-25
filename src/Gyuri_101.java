public class Gyuri_101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }

        return checkSymmetric(root.left, root.right);
    }

    private boolean checkSymmetric(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }

        if (leftNode == null || rightNode == null) {
            return false;
        }

        if (leftNode.val != rightNode.val) {
            return false;
        }

        return checkSymmetric(leftNode.left, rightNode.right) && checkSymmetric(leftNode.right, rightNode.left);
    }
}
