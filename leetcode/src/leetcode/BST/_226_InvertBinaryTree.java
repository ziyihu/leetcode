package leetcode.BST;

public class _226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if ( root == null ) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            TreeNode left = temp.left;
            temp.left = temp.right;
            temp.right = left;
            if(temp.left!=null) stack.push(temp.left);
            if(temp.right!=null) stack.push(temp.right);
        }
        return root;
    }
}
