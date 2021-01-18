package leetcode.BST;

public class _700_SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null && val!=root.val) {
            if(val>root.val) root=root.right;
            else root=root.left;
        }
        return root;
    }
}
