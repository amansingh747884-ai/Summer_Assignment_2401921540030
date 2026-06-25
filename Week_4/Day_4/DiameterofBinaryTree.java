package Week_4.Day_4;

public class DiameterofBinaryTree {
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

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int rootDiameter = height(root.left) + height(root.right);

        int leftDiameter = diameterOfBinaryTree(root.left);

        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
    }

    private int height(TreeNode node) {
        if (node == null)
            return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
