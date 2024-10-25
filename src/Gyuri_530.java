import java.util.*;

public class Gyuri_530 {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            values.add(cur.val);

            if (cur.left != null) {
                queue.add(cur.left);
            }

            if (cur.right != null) {
                queue.add(cur.right);
            }
        }

        Collections.sort(values);
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < values.size(); i++) {
            min = Math.min(min, values.get(i) - values.get(i - 1));
        }

        return min;
    }

    // BST + 중위순회 = 오름차순
    int minValue;
    Integer preValue;   // Integer -> null 가능

    public int getMinimumDifference2(TreeNode root) {
        minValue = Integer.MAX_VALUE;
        preValue = null;

        inorder(root);
        return minValue;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        // left
        inorder(root.left);

        // self
        if (preValue != null) {
            minValue = Math.min(minValue, root.val - preValue);
        }
        preValue = root.val;

        //right
        inorder(root.right);
    }
}
