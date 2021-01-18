package leetcode.BST;

public class _783_MinmumDistanceBetweenBSTNodes {
    Integer prev, min;
    public int minDiffInBST(TreeNode root) {
        prev = null;
        min = Integer.MAX_VALUE;
        dfs(root);
        return min;
    }

    public void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        if (prev != null) min = Math.min(min, node.val - prev);
        prev = node.val;
        dfs(node.right);
    }
}
