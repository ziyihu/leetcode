package leetcode.BST;

public class _98_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
         Integer prev = null;

         while (!stack.isEmpty() || root != null) {
             while (root != null) {
                 stack.push(root);
                 root = root.left;
             }
             root = stack.pop();
             if (prev != null && root.val <= prev) {
                 return false;
             }
             prev = root.val;
             root = root.right;
         }
         return true;
     }
}
