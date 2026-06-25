package Week_4.Day_4;

public class BinaryTreeMaximumPathSum {
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

    public int maxPathSum(TreeNode root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int throughRoot = root.val + maxPathSumFromRoot(root.left) + maxPathSumFromRoot(root.right);

        int leftMax = maxPathSum(root.left);

        int rightMax = maxPathSum(root.right);

        return Math.max(throughRoot, Math.max(leftMax, rightMax));
    }

    private int maxPathSumFromRoot(TreeNode node) {
        if (node == null)
            return 0;
        return Math.max(0, node.val + Math.max(maxPathSumFromRoot(node.left), maxPathSumFromRoot(node.right)));
    }
}
